package org.show.granit.customersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import static org.show.granit.customersregister.DataForTestCustomer.customersRegisterMainButton;

public class CustomerMessageValidation {

    public void validateFields() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTestCustomer dataForTestCustomer = new DataForTestCustomer();
        DataForTest dataForTest = new DataForTest();
        dataForTest.mainButtonClick(customersRegisterMainButton);
        dataForTestCustomer.validateMessageCustomer();
    }
}
