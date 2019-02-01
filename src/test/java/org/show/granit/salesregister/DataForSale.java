package org.show.granit.salesregister;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;
import org.show.granit.utils.DataForTest;

import java.text.SimpleDateFormat;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DataForSale {
    private static final String LocatorMailAddress = ".//*[@id='BankInfo']/div/div/form/fieldset/div[1]/div/div/input";
    private static final String LocatorActualAddress = ".//*[@id='BankInfo']/div/div/form/fieldset/div[2]/div/input";
    private static final String ButtonNoName = ".//*[@id='BankInfo']/div/div/form/fieldset/div[2]/div/input";
    private static final String ButtonOKSM = "./*//*[@id='BankInfo']/div/div/form/fieldset/div[3]/div[1]/div/core-link/div/div[1]/div/button";
    private static final String DataOKSM = "./*//*[@id='inumOKSM']";
    private static final String SelectionOKSM = ".btn.btn-primary.blue.pull-right";
    private static final String ButtonSaveOKSM = "./*//*[@id='oksmGrid']/div[2]/table/tbody/tr/td[2]";
    private static final String ButtonOKATO = ".//*[@id='BankInfo']/div/div/form/fieldset/div[3]/div[2]/div/core-link/div/div[1]/div/button";
    private static final String CSSArrowOKATO = ".k-icon.k-plus";
    private static final String CSSArrowSecondLevelOKATO = "div.k-bot > span.k-icon.k-plus";
    private static final String LocatorDataOKATO = "//li[3]/ul/li/div/span/label";
    private static final String ButtonSaveOKATO = "//div[4]/button[2]";
    private static final String ButtonOKTMO = ".//*[@id='BankInfo']/div/div/form/fieldset/div[4]/div/div/core-link/div/div[1]/div/button";
    private static final String DataOKTMO = "//li[7]/div/span/label";
    private static final String ButtonSaveOKTMO = "//div[4]/button[2]";
    private static final String LocatorInnSales = ".//*[@id='BankInfo']/div/div/form/fieldset/div[5]/div[1]/div/input";
    private static final String LocatorLastNameSales = ".//*[@id='contactPerson']/div/form/fieldset/div[1]/div[1]/div/input";
    private static final String LocatorFirstNameSales = ".//*[@id='contactPerson']/div/form/fieldset/div[1]/div[2]/div/input";
    private static final String LocatorMiddleNameSales = ".//*[@id='contactPerson']/div/form/fieldset/div[1]/div[3]/div/input";
    private static final String LocatorTelephoneNumberSales = "//*[@id='contactPerson']/div/form/fieldset/div[2]/div[1]/div/input";
    private static final String LocatorFaxNumberSales = ".//*[@id='contactPerson']/div/form/fieldset/div[2]/div[2]/div/input";
    private static final String LocatorEmailSales = ".//*[@id='contactPerson']/div/form/fieldset/div[2]/div[3]/div/input";
    private static final String LocatorSearchFieldSalesRegister = ".//*[@id='fastSearch']/div/form/fieldset/div[1]/div/div/div/input";
    private static final String LocatorButtonSearchSalesRegister = ".//*[@id='fastSearch']/div/form/fieldset/div[8]/div/button[1]";
    private static final String LocatorFullNameSales = ".//*[@id='MainInfo']/div/div/form/fieldset/div[2]/div/div/input";
    private static final String LocatorShortNameSales = "//div[3]/div/div/input";
    private static final String LocatorRegistryNumberSPZ = "//div[6]/div/input";
    private static final String LocatorDataSetTaxRegistration = ".//*[@id='MainInfo']/div/div/form/fieldset/div[6]/div[3]/core-date/span/span/input";
    private static final String LocatorSpecializationOrganisation = ".//*[@id='MainInfo']/div/div/form/fieldset/div[7]/div/div/label";
    private static final String LocatorYesButton = "//div[3]/button[2]";
    private static final String AutoTesting = "Авто Тестирование от ";
    private static final String LocatorFieldInnSalesRegister = ".//*[@id='fastSearch']/div/form/fieldset/div[2]/div[1]/input";
    private static final String LocatorEraseButtonSalesRegistry = ".//*[@id='fastSearch']/div/form/fieldset/div[8]/div/button[2]";
    private static final String LocatorFieldKppSalesRegister = ".//*[@id='fastSearch']/div/form/fieldset/div[2]/div[2]/input";
    private static final String TextRegisterSale = "Реестр поставщиков";
    DataForTest dataForTest = new DataForTest();

    protected void requisitesSupplierSalesRegistry() {

        dataForTest.SetData(LocatorMailAddress, "Почтовый адрес:");
        dataForTest.SetData(LocatorActualAddress, "Фактический адрес");
        $(By.xpath(ButtonNoName)).click();
        $(".form-control.valTool").scrollTo();
        $(By.xpath(ButtonOKSM)).click();
        dataForTest.SetData(DataOKSM, "Россия");
        $(By.cssSelector(SelectionOKSM)).click();
        $(By.xpath(ButtonSaveOKSM)).doubleClick();
        $(By.xpath(ButtonOKATO)).click();
        $(By.cssSelector(CSSArrowOKATO)).click();
        $(By.cssSelector(CSSArrowSecondLevelOKATO)).click();
        $(By.xpath(LocatorDataOKATO)).click();
        $(By.xpath(ButtonSaveOKATO)).click();
        $(By.xpath(ButtonOKTMO)).click();
        $(By.xpath(DataOKTMO)).click();
        $(By.xpath(ButtonSaveOKTMO)).click();
        dataForTest.SetData(LocatorInnSales, "463463636363");
    }

    protected void contactFaceSalesRegistry() {
        dataForTest.SetData(LocatorLastNameSales, "Смирнов");
        dataForTest.SetData(LocatorFirstNameSales, "Антон");
        dataForTest.SetData(LocatorMiddleNameSales, "Сергеевич");
        dataForTest.SetData(LocatorTelephoneNumberSales, "7909090909");
        dataForTest.SetData(LocatorFaxNumberSales, "7909090909");
        dataForTest.SetData(LocatorEmailSales, "tester@test.com");
    }

    protected void saveSalesRegister() {
        $(By.cssSelector(".btn.btn-default.btn-indent.green.pull-right")).click();
        dataForTest.delayAction(2000);
        $(byText(TextRegisterSale)).shouldBe(visible);
        dataForTest.textByClick(TextRegisterSale);
    }

    protected void validateCreateNewSales(SimpleDateFormat formattedDate) {
        DataForTest dataForTest = new DataForTest();
        dataForTest.SetData(LocatorSearchFieldSalesRegister, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorButtonSearchSalesRegister)).click();
        $$("#accordion").shouldHave(CollectionCondition.texts(AutoTesting + formattedDate.format(System.currentTimeMillis())));
    }

    protected void ValidateAndDeleteNewSale(SimpleDateFormat formattedDate) {
        dataForTest.SetData(LocatorSearchFieldSalesRegister, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorButtonSearchSalesRegister)).click();
        $$("#supplierGrid").findBy((text(AutoTesting + formattedDate.format(System.currentTimeMillis())))).doubleClick();
        $(".btn.btn-danger.pull-right.btn-indent").click();
        $(byText("Вы уверены, что хотите удалить данного поставщика?")).shouldBe(visible);
        $(By.xpath(LocatorYesButton)).click();
    }

    protected void validateNameSale() {
        dataForTest.SetData(LocatorSearchFieldSalesRegister, "1");
        $(By.xpath(LocatorButtonSearchSalesRegister)).click();
        $$("#employeeGrid").findBy(text("1"));
        $(By.xpath(LocatorEraseButtonSalesRegistry)).click();

    }

    protected void validateInnSale() {
        $(By.xpath(".//*[@id='supplierGrid']/table/tbody/tr[3]/td[1]/a")).scrollTo();
        dataForTest.SetData(LocatorFieldInnSalesRegister, "1");
        $(By.xpath(LocatorButtonSearchSalesRegister)).click();
        $$("#employeeGrid").findBy(text("1"));
    }

    protected void validateKppSale() {
        dataForTest.SetData(LocatorFieldKppSalesRegister, "1");
        $(By.xpath(LocatorButtonSearchSalesRegister)).click();
        $$("#employeeGrid").findBy(text("1"));
    }

    protected void validateMessageSale() {
        $(".btn.btn-default.green.btn-indent").click();
        $(".btn.btn-default.btn-indent.green.pull-right").click();
        $(".modal-body.text-danger.ng-binding.ng-scope")
                .shouldHave(text("Для операции сохранения необходимо заполнить следующие поля: "),
                        text("• Имя"),
                        text("• Фамилия"),
                        text("• Телефон"),
                        text("• Электронная почта"),
                        text("• Правовая форма (ОКОПФ)\n"),
                        text("• Полное наименование"),
                        text("• Почтовый адрес"),
                        text("• ИНН"),
                        text("• ОКТМО"),
                        text("• Место регистрации (ОКАТО)"),
                        text("• Страна регистрации (ОКСМ)"));
    }

    protected void basicInformationSalesRegistry(SimpleDateFormat formattedDate) {
        $(By.xpath("//button[@type='button']")).click();
        $(By.cssSelector("span.k-icon.k-i-arrow-s")).click();
        $(By.xpath("//div[6]/div/ul/li[3]")).click();
        dataForTest.SetData(LocatorFullNameSales, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        dataForTest.SetData(LocatorShortNameSales, AutoTesting + formattedDate.format(System.currentTimeMillis()));
        dataForTest.SetData(LocatorRegistryNumberSPZ, "78696969696");
        dataForTest.SetData(LocatorDataSetTaxRegistration, "" + formattedDate.format(System.currentTimeMillis()));
        $(By.xpath(LocatorSpecializationOrganisation)).click();
    }
}
