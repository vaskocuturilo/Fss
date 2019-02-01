package org.show.granit.test;

import org.junit.Test;
import org.show.granit.salesregister.CreateSale;
import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

public class TestRun {

    @Test
    public void smokeTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest test = new DataForTest();
        CreateSale sale = new CreateSale();
        test.Control(DataForTest.procrumentPlan, ".col-xs-7.indent>h1", "Планы ЗАКУПОК");
        test.Control(DataForTest.planSchedule, ".col-xs-10.indent>h1", "Планы-графики закупок");
        test.Control(DataForTest.registerProcrument, ".col-xs-12.indent>h1", "РЕЕСТР ЗАКУПОК");

    }
}


