package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthorsLocators {
    public static final SelenideElement TXT_SURNAME = $("//input[@id='surname']");
    public static final SelenideElement SELECT_CODE_TYPE = $("//select[@id='codetype']");
    public static final SelenideElement TXT_CODE_VALUE = $("//input[@id='codevalue']");
    public static final SelenideElement SELECT_TOWN = $("//select[@name='town' and @class='input']");
    public static final SelenideElement SELECT_COUNTRY = $("//select[@name='countryid' and @class='input']");
    public static final SelenideElement CHECKBOX_INAFFIL = $("//input[@type='checkbox' and @name='inaffil']");
    public static final SelenideElement BTN_SELECT_ORGANIZATION = $("//div[@class='butblue' and text()='Выбрать']");
    public static final SelenideElement MODAL_ORGANIZATION = $("//form[@method='post' and @onkeypress='submit_enter(event)']");
    public static final SelenideElement SELECT_AUTHOR_BOX = $("//select[@name='authorboxid' and @id='authorboxid']");
    public static final SelenideElement CHECKBOX_RUBRIC_INREG = $("//input[@type='checkbox' and @id='rubricinreg']");
    public static final SelenideElement SELECT_THEME = $("//select[@id='rubriccode' and @name='rubriccode']");
    public static final SelenideElement SELECT_METRIC = $("//select[@class='input' and @name='metrics']");
    public static final SelenideElement CHECKBOX_SHOW_NOPUBL = $("//input[@type='checkbox' and @id='show_nopubl']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@id='order' and @name='order']");
    public static final SelenideElement LINK_AUTHORS_TUTORIAL = $("//a[text()='Инструкция для авторов']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");

    //модальное окно
    public static final SelenideElement MODAL_TXT_QWD = MODAL_ORGANIZATION.$("//input[@id='qwd']");
    public static final SelenideElement MODAL_SELECT_TOWN = MODAL_ORGANIZATION.$("//select[@name='town' and @class='input']");
    public static final SelenideElement MODAL_BTN_SEARCH = MODAL_ORGANIZATION.$("//div[@class='butred' and text()='Поиск']");
}
