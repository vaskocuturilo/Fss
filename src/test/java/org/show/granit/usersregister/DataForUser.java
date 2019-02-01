package org.show.granit.usersregister;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.show.granit.utils.DataForTest;

import java.text.SimpleDateFormat;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DataForUser {
    private static final String SexUser = "nameRadios1";
    private static final String LocatorLastNameUser = "(//input[@type='text'])[4]";
    private static final String LocatorFirstNameUser = "(//input[@type='text'])[5]";
    private static final String LocatorMiddleNameUser = "(//input[@type='text'])[6]";
    private static final String LocatorStatus = "genderRadios1";
    private static final String LocatorCompany = "(//button[@type='button'])[6]";
    private static final String LocatorFSSCA = "//div[@id='customersGrid']/div[2]/table/tbody/tr/td[3]";
    private static final String LocatorPositionUser = "(//input[@type='text'])[8]";
    private static final String LocatorTelephoneNumberUser = ".//*[@id='MainInfo']/div/div/form/fieldset/div[12]/div[2]/input";
    private static final String LocatorEmailUser = "(//input[@type='text'])[10]";
    private static final String LocatorSearchFieldUserRegister = ".//*[@id='fastSearch']/div/div/form/fieldset/div[1]/div[1]/div/input";
    private static final String LocatorSearchButton = ".//*[@id='fastSearch']/div/div/form/fieldset/div[4]/div/button[1]";
    private static final String LocatorAddRoleUserButton = ".//*[@id='main']/div[2]/div/div/div[3]/div[1]/div/button";
    private static final String LocatorAnyRole = ".//*[@id='roleDialogGrid']/div[2]/table/tbody/tr[2]/td[2]";
    private static final String LocatorAddRole = "html/body/div[6]/div/div/div[3]/button[2]";
    private static final String LocatorAddRightsUserButton = ".//*[@id='main']/div[2]/div/div/div[4]/div[1]/div/button";
    private static final String LocatorAnyRights = ".//*[@id='permissionDialogGrid']/div[2]/table/tbody/tr[1]/td[2]";
    private static final String LocatorAddRights = "html/body/div[6]/div/div/div[4]/button[3]";
    private static final String LocatorSelectAnyRole = ".//*[@id='roleGrid']/div[2]/table/tbody/tr/td[4]/a";
    private static final String LocatorYesButton = "//div[3]/button[2]";
    private static final String LocatorSelectAnyRights = ".//*[@id='permissionGrid']/div[2]/table/tbody/tr[1]/td[4]/a";
    private static final String TextRegisterUser = "Реестр пользователей";
    private static final String TextToArchive = "Перенести в архив";
    DataForTest datafortest = new DataForTest();

    protected void basicInformationUserRegistry(SimpleDateFormat formattedDate) {
        $(By.xpath("//button")).click();
        $(".btn.btn-primary.blue.pull-right.btn-indent").shouldBe(Condition.enabled);
        datafortest.SetData("//input", "test" + formattedDate.format(System.currentTimeMillis()));
        $(By.id(LocatorStatus)).click();
        datafortest.SetData(LocatorLastNameUser, "Тестеров");
        datafortest.SetData(LocatorFirstNameUser, "Тестер");
        datafortest.SetData(LocatorMiddleNameUser, "Тестерович");
        $(By.id(SexUser)).click();
        $(By.xpath(LocatorCompany)).click();
        $(By.xpath(LocatorFSSCA)).doubleClick();
        datafortest.SetData(LocatorPositionUser, "Тестер");
        datafortest.SetData(LocatorTelephoneNumberUser, "7-909-090-90-90");
        datafortest.SetData(LocatorEmailUser, "tester@test.com");
    }

    protected void saveUserRegister() {
        $(By.cssSelector(".btn.btn-primary.blue.pull-right.btn-indent")).click();
        datafortest.delayAction(2000);
        $(byText(TextRegisterUser)).shouldBe(visible);
        datafortest.textByClick(TextRegisterUser);
    }

    protected void validateCreateNewUser(SimpleDateFormat formattedDate) {
        datafortest.SetData(LocatorSearchFieldUserRegister, "test" + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorSearchButton)).click();
        //  $$("#employeeGrid").findBy(text("test" + formattedDate.format(System.currentTimeMillis())));
    }

    protected void validateUserAndEdit(SimpleDateFormat formattedDate) {
        datafortest.SetData(LocatorSearchFieldUserRegister, "test" + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorSearchButton)).click();
        $$("#employeeGrid").findBy(text("test" + formattedDate.format(System.currentTimeMillis()))).doubleClick();
    }

    protected void addRoleUser() {
        $(".btn.btn-primary.blue.pull-right.btn-indent").scrollTo();
        $(By.xpath(LocatorAddRoleUserButton)).click();
        $(By.xpath(LocatorAnyRole)).click();
        $(By.xpath(LocatorAddRole)).click();
    }

    protected void addRightsUser() {
        $(".form-control.valTool.ng-pristine.ng-valid.k-textbox").scrollTo();
        $(By.xpath(LocatorAddRightsUserButton)).click();
        $(By.xpath(LocatorAnyRights)).click();
        $(By.xpath(LocatorAddRights)).click();
    }

    protected void deleteRoleUser() {
        $(By.xpath(LocatorSelectAnyRole)).click();
        $(byText("Вы уверены, что хотите удалить роль пользователя?")).shouldBe(visible);
        $(By.xpath(LocatorYesButton)).click();
    }

    protected void deleteRightsUser() {
        $(By.xpath(LocatorSelectAnyRights)).click();
        $(byText("Вы уверены, что хотите удалить право пользователя?")).shouldBe(visible);
        $(By.xpath(LocatorYesButton)).click();
    }

    protected void validateMessageUser() {
        $(By.cssSelector(".btn.btn-primary.blue.pull-right")).click();
        $(By.xpath("//button")).click();
        $(".modal-body.text-danger.ng-binding.ng-scope").shouldHave(text("Для операции сохранения необходимо заполнить следующие поля: "),
                text("∙ Поле \"Фамилия\" обязательно для заполнения, должно состоять из русских букв и начинаться с заглавной буквы."),
                text("∙ Поле \"Организация\" обязательно для заполнения."),
                text("∙ Поле \"Телефон\" обязательно для заполнения."),
                text("∙ Поле \"Электронная почта\" обязательно для заполнения."));
    }

    protected void deleteNewUser() {
        datafortest.textByClick(TextToArchive);
        datafortest.textByClick(TextRegisterUser);
        $(By.cssSelector("label.out-check")).click();
    }

    protected void removeDeleteUser() {
        $(By.xpath("//button[3]")).click();
        $(byText(TextRegisterUser)).shouldBe(visible);
        $(By.id("nameRadios1")).click();
        $(By.xpath("//button")).click();
    }
}
