package org.show.granit.utils;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class DataForTest {
    public static final String userRegisterMainButton = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[10]/div/p";
    public static final String salesRegisterMainButton = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[9]";
    public static final String procrumentPlan = ".//*[@id='fssMainDiv']/div/div[2]/div[1]/div[1]";
    public static final String planSchedule = ".//*[@id='fssMainDiv']/div/div[2]/div[1]/div[2]";
    public static  final String registerProcrument = ".//*[@id='fssMainDiv']/div/div[2]/div[1]/div[3]";
    public static final String contractRegisterMainButton = ".//*[@id='fssMainDiv']/div/div[2]/div[1]/div[4]";
    public static final String Directorys = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[11]/div/p";
    public static final String MonitoringCenter = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[1]/div/p";
    public static final String TypicalForm = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[2]/div/p";
    public static final String RegisterContractArchive = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[3]/div/p";
    public static final String Accountability = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[12]/div/p";
    public static final String NeedsRegistry = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[14]/div/p";
    public static final String RegisterOfComplaints = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[13]/div/p";
    public static final String OpenContract = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[4]/a/p";

    public void SetData(String locator, String value) {
        $(By.xpath(locator)).setValue(value);
    }

    public void delayAction(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void quitFromTestStand() {
        $(By.cssSelector(".user-name-box>ul>li>a")).click();
    }

    public void textByClick(String text) {
        $(byText(text)).click();
    }

    public void mainButtonClick(String locator) {
        $(By.xpath(locator)).click();
    }

    public void Page(String locator) {
        $(By.xpath(locator)).click();
    }

    public void Control(String Main, String selector, String text) {
        $(By.xpath(Main)).click();
        $$(selector).shouldHave(CollectionCondition.texts(text));
        $(By.cssSelector(".logo.ng-binding")).click();
    }
}



