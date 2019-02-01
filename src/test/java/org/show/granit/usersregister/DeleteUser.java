package org.show.granit.usersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;

public class DeleteUser extends DataForTest {

    public void delete() {
        LoginPage loginPage = new LoginPage();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForUser dataForUser = new DataForUser();
        dataForTest.mainButtonClick(userRegisterMainButton);
        dataForUser.validateUserAndEdit(formattedDate);
        dataForUser.deleteNewUser();
        dataForUser.validateUserAndEdit(formattedDate);
        dataForUser.removeDeleteUser();
    }
}
