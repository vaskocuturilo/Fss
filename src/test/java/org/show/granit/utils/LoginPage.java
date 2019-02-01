package org.show.granit.utils;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    private static final String TEST_FSS_MAIN = "http://www.google.com/ncr";
    private static final String MainLogin = "";
    private static final String MainPassword = "";

    /*private static final String DepartamentLogin = "";
    private static final String DepartamentPassword = "";
    private static final String FilialLogin = "";
    private static final String FilialPassword = "";
    private static final String RegionLogin = "";
    private static final String RegionPassword = "";
    */
    public void MainLogin() {
        Selenide.open(TEST_FSS_MAIN);
        $(By.id("loginTxt")).setValue(MainLogin).pressTab();
        $(By.id("passwordTxt")).setValue(MainPassword).pressTab();
        $(By.className("send-data")).click();
    }

   /* public void departamentLogin() {
        open(TEST_FSS_MAIN);
        $(By.id("loginTxt")).setValue(DepartamentLogin).pressTab();
        $(By.id("passwordTxt")).setValue(DepartamentPassword).pressTab();
        $(By.className("send-data")).click();
    }

    public void filialLogin() {
        open(TEST_FSS_MAIN);
        $(By.id("loginTxt")).setValue(FilialLogin).pressTab();
        $(By.id("passwordTxt")).setValue(FilialPassword).pressTab();
        $(By.className("send-data")).click();
    }

    public void regionLogin() {
        open(TEST_FSS_MAIN);
        $(By.id("loginTxt")).setValue(RegionLogin).pressTab();
        $(By.id("passwordTxt")).setValue(RegionPassword).pressTab();
        $(By.className("send-data")).click();
   */
}

