package org.show.granit.salesregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import static org.show.granit.utils.DataForTest.salesRegisterMainButton;

public class SaleFieldValidation {

    public void validateFields() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForSale dataForSale = new DataForSale();
        dataForTest.mainButtonClick(salesRegisterMainButton);
        dataForSale.validateMessageSale();
    }
}

