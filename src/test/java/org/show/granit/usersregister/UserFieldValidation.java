package org.show.granit.usersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import static org.show.granit.utils.DataForTest.userRegisterMainButton;

public class UserFieldValidation {

    public void Validate() {
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForUser dataForUser = new DataForUser();
        dataForTest.mainButtonClick(userRegisterMainButton);
        dataForUser.validateMessageUser();
    }
}
