package org.show.granit.usersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import static org.show.granit.utils.DataForTest.userRegisterMainButton;

public class ExportUsers {

    public void ClickToTheExportButton() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        dataForTest.mainButtonClick(userRegisterMainButton);
        ExportFileUser exportFileUser = new ExportFileUser();
        exportFileUser.exportFiletoExcel(".btn.btn-default.indent-btn.green.excel-btn.pull-right");
    }
}
