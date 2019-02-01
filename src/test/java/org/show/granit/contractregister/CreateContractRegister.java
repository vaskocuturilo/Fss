package org.show.granit.contractregister;

import org.openqa.selenium.By;
import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CreateContractRegister extends DataForTest {
    public void searchContractReviewInAllParameters() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        mainButtonClick(contractRegisterMainButton);
        $(By.cssSelector(".filter-icon-box")).click();
        $(By.className("valTool")).click();
        executeJavaScript("$($0).data(\"kendoComboBox\").select(3)");
    }
}
