package org.show.granit.customersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;
import java.util.Random;

import static org.show.granit.customersregister.DataForTestCustomer.customersRegisterMainButton;

public class CreateCustomer {

    public void createCustomerRegistry() {
        LoginPage loginPage = new LoginPage();
        Random rand = new Random();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        loginPage.MainLogin();
        DataForTestCustomer dataForTestCustomer = new DataForTestCustomer();
        DataForTest dataForTest = new DataForTest();
        dataForTest.mainButtonClick(customersRegisterMainButton);
        dataForTestCustomer.basicInformationCustomerRegistry(rand, formattedDate);
        dataForTestCustomer.requisitesCustomersRegistry();
        dataForTestCustomer.customerContactCustomersRegistry("Смирнов", "Антон", "Сергеевич", "8909090909", "8909090909", "tester@testr.com", "Тестер");
        dataForTestCustomer.saveCustomersRegister();
        dataForTestCustomer.validateCreateNewCustomers(formattedDate);
/*
        mainButtonClick(customersRegisterMainButton);
        basicInformationCustomerRegistry(rand, formattedDate);
       // classificationCustomerRegistry();
        requisitesCustomersRegistry();
        customerContactCustomersRegistry("Смирнов","Антон","Сергеевич","8909090909","8909090909","tester@testr.com","Тестер");
        saveCustomersRegister();
        validateCreateNewCustomers(formattedDate);*/
    }
}


