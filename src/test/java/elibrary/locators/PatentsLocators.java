package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PatentsLocators {
    public static final SelenideElement SELECT_PATENT_TYPE = $("//select[@class='input' and @name='patenttype']");
    public static final SelenideElement TXT_PATENT_NUMBER = $("//input[@id='patentnumber']");
    public static final SelenideElement TXT_PATENT_NAME = $("//input[@id='patentname']");
    public static final SelenideElement SELECT_SCOPE = $("//select[@class='input' and @id='scope']");
    public static final SelenideElement TXT_AUTHOR = $("//input[@id='author']");
    public static final SelenideElement TXT_RIGHT_HOLDER = $("//input[@id='rightholder']");
    public static final SelenideElement SELECT_YEAR_PUBL = $("//select[@class='input' and @name='yearpubl']");
    public static final SelenideElement SELECT_COUNTRY_ID = $("//select[@class='input' and @name='countryid']");
    public static final SelenideElement BLOCK_MPK_NAME = $("//div[@id='mpk_name']");
    public static final SelenideElement BTN_SELECT = $("//div[@class='butblue' and text()='Выбрать']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@id='order' and @name='order']");
    public static final SelenideElement LINK_SELECT_ALL_PATENTS = $("//a[text()='Выделить все патенты на этой странице']");
    public static final SelenideElement LINK_CLEAR_SELECTION = $("//a[text()='Снять выделение']");
    public static final SelenideElement LINK_ADD_SELECTED_PATENTS = $("//a[text()='Добавить выделенные патенты в подборку:']");
    public static final SelenideElement LINK_ADD_ALL_PATENTS = $("//a[text()='Добавить все патенты в указанную выше подборку']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");
}
