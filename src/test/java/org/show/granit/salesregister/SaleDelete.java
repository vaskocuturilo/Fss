package org.show.granit.salesregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;

import static org.show.granit.utils.DataForTest.salesRegisterMainButton;

public class SaleDelete {

    public void deleteSale() throws Exception {
        LoginPage loginPage = new LoginPage();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForSale dataForSale = new DataForSale();
        dataForTest.mainButtonClick(salesRegisterMainButton);
        dataForSale.ValidateAndDeleteNewSale(formattedDate);
    }
}
