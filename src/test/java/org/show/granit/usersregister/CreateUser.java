package org.show.granit.usersregister;

import org.show.granit.utils.DataForTest;
import org.show.granit.utils.LoginPage;

import java.text.SimpleDateFormat;

import static org.show.granit.utils.DataForTest.userRegisterMainButton;

public class CreateUser {

    public void createNewUser() throws Exception {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        LoginPage loginPage = new LoginPage();
        loginPage.MainLogin();
        DataForTest dataForTest = new DataForTest();
        DataForUser dataForUser = new DataForUser();
        dataForTest.mainButtonClick(userRegisterMainButton);
        dataForUser.basicInformationUserRegistry(formattedDate);
        dataForUser.saveUserRegister();
        dataForUser.validateCreateNewUser(formattedDate);
    }


}
