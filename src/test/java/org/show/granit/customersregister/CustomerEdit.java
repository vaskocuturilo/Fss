package org.show.granit.customersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;

import static org.show.granit.customersregister.DataForTestCustomer.customersRegisterMainButton;

public class CustomerEdit {

    public void editNewCustomer() throws Exception {
        LoginPage loginPage = new LoginPage();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        loginPage.MainLogin();
        DataForTestCustomer dataForTestCustomer = new DataForTestCustomer();
        DataForTest dataForTest = new DataForTest();
        dataForTest.mainButtonClick(customersRegisterMainButton);
        dataForTestCustomer.editAndSaveCreateNewCustomers(formattedDate);
        dataForTestCustomer.saveCustomersRegister();
    }
}
