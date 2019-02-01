package org.show.granit.customersregister;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DataForTestCustomer {
    public static final String customersRegisterMainButton = ".//*[@id='fssMainDiv']/div/div[2]/div[2]/div[8]/div/p";
    private static final String ButtonCreateNewCustomer = ".//*[@id='main']/div/div/div/div[1]/div[2]/button";
    private static final String LocatorNumberSPZ = ".//*[@id='MainInfo']/div/div/form/fieldset/div[1]/div[3]/input";
    private static final String LocatorNumberIKO = ".//*[@id='MainInfo']/div/div/form/fieldset/div[2]/div[2]/input";
    private static final String LocatorDataIKO = ".//*[@id='MainInfo']/div/div/form/fieldset/div[2]/div[4]/core-date/span/span/input";
    private static final String LocatorNameCustomer = ".//*[@id='MainInfo']/div/div/form/fieldset/div[3]/div[2]/textarea[2]";
    private static final String LocatorShortNameCustomer = ".//*[@id='MainInfo']/div/div/form/fieldset/div[4]/div[2]/input";
    private static final String LocatorArrowDataTax = ".//div[@id='MainInfo']/div/div/form/fieldset/div[6]/div[2]/core-date/span/span/span/span";
    private static final String LocatorDataSetTaxCustomer = ".//*[@id='MainInfo']/div/div/form/fieldset/div[6]/div[2]/core-date/span/span/input";
    private static final String LocatorFinancingSourcesCustomer = ".//*[@id='MainInfo']/div/div/form/fieldset/div[10]/div[2]/input";
    private static final String LocatorLevelStructCustomer = ".//div[@id='MainInfo']/div/div/form/fieldset/div[8]/div[2]/core-combo/div/div/span/span/span/span";
    private static final String LocatorDataLevelCustomer = "//div[12]/div/ul/li";
    private static final String LocatorFederalDistrict = ".//div[@id='MainInfo']/div/div/form/fieldset/div[11]/div[2]/core-combo/div/div/span/span/span/span";
    private static final String LocatorDataFederalDistrict = ".//div[13]/div/ul/li[4]";
    private static final String LocatorClassificationCustomer = ".//*[@id='Classification']/div/div/form/fieldset/div[1]/div[1]/div/label";
    private static final String LocatorMailAddressCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[1]/div/div/input";
    private static final String LocatorActualAddressCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[2]/div/div/input";
    private static final String LocatorINNCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[4]/div[1]/div/input";
    private static final String LocatorOGRNCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[4]/div[2]/div/input";
    private static final String LocatorKPPCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[4]/div[3]/div/input";
    private static final String LocatorOKPOCustomer = ".//*[@id='Details']/div/div/form/fieldset/div[5]/div/div/input";
    private static final String LocatorLastNameCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[1]/div[1]/div/input";
    private static final String LocatorFirstNameCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[1]/div[2]/div/input";
    private static final String LocatorMiddleNameCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[1]/div[3]/div/input";
    private static final String LocatorTelephoneNumberCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[2]/div[1]/div/input";
    private static final String LocatorFaxNumberCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[2]/div[2]/div/input";
    private static final String LocatorEmailCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[2]/div[3]/div/input";
    private static final String LocatorPositionCustomer = ".//*[@id='contacts']/div/div/form/fieldset/div[3]/div/div/input";
    private static final String LocatorSearchFieldCustomerRegister = ".//*[@id='fastSearch']/div/div/form/fieldset/div[1]/div[4]/div/textarea";
    private static final String LocatorFindButtonCustomerRegister = ".//*[@id='fastSearch']/div/div/form/fieldset/div[3]/div/div[2]/button[1]";
    private static final String TextRegisterCustomer = "Реестр заказчиков";
    private static final String AutoTesting = "Авто Тестирование от ";


    private void SetData(String locator, String value) {
        $(By.xpath(locator)).setValue(value);
    }

    protected void basicInformationCustomerRegistry(Random rand, SimpleDateFormat formattedDate) {

        $(By.xpath(ButtonCreateNewCustomer)).click();
        SetData(LocatorNumberSPZ, String.valueOf(rand.nextInt(999)));
        SetData(LocatorNumberIKO, String.valueOf(rand.nextDouble()) + rand.nextInt(1999));

        $(By.cssSelector(".k-icon.k-i-arrow-s")).click();
        $(By.xpath("//div[10]/div/ul/li[4]")).click();
        $(By.cssSelector(".k-icon.k-i-calendar")).click();

        SetData(LocatorDataIKO, "" + formattedDate.format(System.currentTimeMillis()));
        SetData(LocatorNameCustomer, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        SetData(LocatorShortNameCustomer, AutoTesting + formattedDate.format(System.currentTimeMillis()));

        $(By.xpath(LocatorArrowDataTax)).click();

        SetData(LocatorDataSetTaxCustomer, "" + formattedDate.format(System.currentTimeMillis()));
        SetData(LocatorFinancingSourcesCustomer, "100000");
        $(By.xpath(LocatorLevelStructCustomer)).click();
        $(By.xpath(LocatorDataLevelCustomer)).click();
        $(By.xpath(LocatorFederalDistrict)).click();
        $(By.xpath(LocatorDataFederalDistrict)).click();
    }

  /*  public void classificationCustomerRegistry() {
        $(By.xpath(LocatorClassificationCustomer)).click();
    }*/

    protected void requisitesCustomersRegistry() {
        SetData(LocatorMailAddressCustomer, "Почтовый адрес:");
        SetData(LocatorActualAddressCustomer, "Фактический адрес:");
        SetData(LocatorINNCustomer, "3463463636");
        SetData(LocatorOGRNCustomer, "2353463673636");
        SetData(LocatorKPPCustomer, "253463636");
        SetData(LocatorOKPOCustomer, "34634666");
    }

    protected void customerContactCustomersRegistry(String lastName, String firstName, String middleName, String Telephone, String Fax, String Email, String Position) {

        SetData(LocatorLastNameCustomer, lastName);
        SetData(LocatorFirstNameCustomer, firstName);
        SetData(LocatorMiddleNameCustomer, middleName);
        SetData(LocatorTelephoneNumberCustomer, Telephone);
        SetData(LocatorFaxNumberCustomer, Fax);
        SetData(LocatorEmailCustomer, Email);
        SetData(LocatorPositionCustomer, Position);
    }

    protected void saveCustomersRegister() {
        $(By.cssSelector(".btn.btn-primary.blue.pull-right")).click();
        delayAction(4000);
        $(byText(TextRegisterCustomer)).shouldBe(visible);
        textByClick(TextRegisterCustomer);
    }

    protected void validateCreateNewCustomers(SimpleDateFormat formattedDate) {
        SetData(LocatorSearchFieldCustomerRegister, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorFindButtonCustomerRegister)).click();
        $$("#employeeGrid").findBy(text(AutoTesting + formattedDate.format(System.currentTimeMillis())));
    }

    protected void editAndSaveCreateNewCustomers(SimpleDateFormat formattedDate) {
        SetData(LocatorSearchFieldCustomerRegister, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorFindButtonCustomerRegister)).click();
        $$("#customerGrid").findBy(text(AutoTesting + formattedDate.format(System.currentTimeMillis()))).doubleClick();
        SetData(LocatorNameCustomer, AutoTesting + formattedDate.format(System.currentTimeMillis()) + " Проверка Редактирования");
    }

    protected void validateMessageCustomer() {
        $(".btn.btn-primary.blue.ng-scope").click();
        $(".btn.btn-primary.blue.pull-right").click();
        $(".modal-body.text-danger.ng-binding.ng-scope")
                .shouldHave(text("Для операции сохранения необходимо заполнить следующие поля: "),
                        text("• Телефон"),
                        text("• Факс"),
                        text("• Должность"),
                        text("• Правовая форма"),
                        text("• Имя"),
                        text("• Фамилия"),
                        text("• Электронная почта"),
                        text("• Номер в СПЗ"),
                        text("• ИКО"),
                        text("• Дата присвоения ИКО"),
                        text("• Наименование"),
                        text("• Краткое наименование"),
                        text("• Почтовый адрес"),
                        text("• Фактический адрес"),
                        text("• ИНН"),
                        text("• КПП"),
                        text("• ОГРН"),
                        text("• Федеральный округ"),
                        text("• ОКПО"),
                        text("• Уровень структурного подразделения"));
    }

    private void delayAction(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void textByClick(String text) {
        $(byText(text)).click();
    }

}
