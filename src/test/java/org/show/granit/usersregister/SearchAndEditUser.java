package org.show.granit.usersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;

public class SearchAndEditUser extends DataForTest {

    public void findNewUser() {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForUser dataForUser = new DataForUser();
        mainButtonClick(userRegisterMainButton);
        dataForUser.validateUserAndEdit(formattedDate);
        dataForUser.addRoleUser();
        dataForUser.addRightsUser();
        dataForUser.deleteRoleUser();
        dataForUser.deleteRightsUser();
        dataForUser.saveUserRegister();
    }
}
