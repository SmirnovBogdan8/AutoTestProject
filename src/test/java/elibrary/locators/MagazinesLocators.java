package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MagazinesLocators {
    public static final SelenideElement TXT_TITLE_NAME = $("//input[@id='titlename']");
    public static final SelenideElement SELECT_COUNTRY_ID = $("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_RUBRIC_CODE = $("//select[@class='input' and @name='rubriccode']");
    public static final SelenideElement SELECT_LANGUAGE = $("//select[@class='input' and @name='language']");
    public static final SelenideElement SELECT_TRANSLATED = $("//select[@class='input' and @name='translated']");
    public static final SelenideElement SELECT_WOS = $("//select[@class='input' and @name='wos']");
    public static final SelenideElement SELECT_SCOPUS = $("//select[@class='input' and @name='scopus']");
    public static final SelenideElement SELECT_WHITE = $("//select[@class='input' and @name='white']");
    public static final SelenideElement SELECT_VAK = $("//select[@class='input' and @name='vak']");
    public static final SelenideElement SELECT_RISC = $("//select[@class='input' and @name='risc']");
    public static final SelenideElement SELECT_FTOPEN = $("//select[@class='input' and @name='ftopen']");
    public static final SelenideElement CHECKBOX_RSCI = $("//input[@type='checkbox' and @id='rsci']");
    public static final SelenideElement CHECKBOX_CORE_RISC = $("//input[@type='checkbox' and @id='corerisc']");
    public static final SelenideElement CHECKBOX_IS_ACTIVE = $("//input[@type='checkbox' and @id='isactive']");
    public static final SelenideElement CHECKBOX_DOAJ = $("//input[@type='checkbox' and @id='doaj']");
    public static final SelenideElement CHECKBOX_FULL_TEXT = $("//input[@type='checkbox' and @id='fulltext']");
    public static final SelenideElement CHECKBOX_ISSCIENTIFIC = $("//input[@type='checkbox' and @id='isscientific']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@id='order' and @name='order']");
    public static final SelenideElement LINK_JOURNALS_COMPARISON = $("//a[text()='Сравнение библиометрических показателей журналов']");
    public static final SelenideElement LINK_JOURNALS_PERSONAL_COLLECTIONS = $("//a[text()='Персональные подборки журналов']");
    public static final SelenideElement LINK_JOURNALS_OPEN_ACCESS_LIST = $("//a[text()='Список российских журналов, находящихся полностью или частично в открытом доступе']");
    public static final SelenideElement LINK_JOURNALS_ELECTRONIC_SUBSCRIPTION = $("//a[text()='Подписка на российские научные журналы в электронном виде']");
    public static final SelenideElement LINK_JOURNALS_ADDED_TO_RINC_2025 = $("//a[text()='Список журналов, включенных в РИНЦ с 2025 года']");
    public static final SelenideElement LINK_JOURNALS_EXCLUDED_FROM_RINC = $("//a[text()='Cписок журналов, исключенных из РИНЦ']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");

}
