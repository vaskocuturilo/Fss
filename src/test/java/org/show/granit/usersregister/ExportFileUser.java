package org.show.granit.usersregister;

import com.codeborne.selenide.WebDriverRunner;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$;

public class ExportFileUser {

    protected void exportFiletoExcel(String Button) {
        BrowserMobProxyServer proxyServer = new BrowserMobProxyServer();
        proxyServer.start();
        WebDriverRunner.setProxy(ClientUtil.createSeleniumProxy(proxyServer));
        proxyServer.addResponseFilter(FileDownloader.withContent());
        $(By.cssSelector(Button)).click();

    }

    public static class FileDownloader implements ResponseFilter {
        private final Set<String> contentTypes = new HashSet<>();
        private final String dirPath = "C:\\Temp";
        private final File tempDir = new File(dirPath);
        private File tempFile = null;

        public FileDownloader addContentType(String contentType) {
            contentTypes.add(contentType);
            return this;
        }

        public static FileDownloader withContent() {
            return new FileDownloader().addContentType("application/excel");
        }

        public static FileDownloader withContents(String... contentType) {
            FileDownloader downloader = new FileDownloader();
            for (String aContentType : contentType) {
                downloader.addContentType(aContentType);
            }
            return downloader;
        }

        @Override
        public void filterResponse(io.netty.handler.codec.http.HttpResponse response, HttpMessageContents contents, HttpMessageInfo messageInfo) {
            String contentType = response.headers().get("Content-Type");
            if (contentTypes.contains(contentType)) {
                try {
                    String postfix = contentType.substring(contentType.indexOf('/') + 1);
                    tempFile = File.createTempFile("downloaded", "." + postfix, tempDir);
                    tempFile.deleteOnExit();

                    FileOutputStream outputStream = new FileOutputStream(tempFile);

                    outputStream.write(contents.getBinaryContents());
                    outputStream.close();

                    response.headers().remove("Content-Type");
                    response.headers().remove("Content-Encoding");
                    response.headers().remove("Content-Disposition");

                    response.headers().add("Content-Type", "text/html");
                    response.headers().add("Content-Length", "" + tempFile.getAbsolutePath().length());
                    contents.setTextContents(tempFile.getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
