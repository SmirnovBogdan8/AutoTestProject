package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MagazinesLocators {
    public static final SelenideElement TXT_TITLE_NAME = $x("//input[@id='titlename']");
    public static final SelenideElement SELECT_COUNTRY_ID = $x("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_RUBRIC_CODE = $x("//select[@class='input' and @name='rubriccode']");
    public static final SelenideElement SELECT_LANGUAGE = $x("//select[@class='input' and @name='language']");
    public static final SelenideElement SELECT_TRANSLATED = $x("//select[@class='input' and @name='translated']");
    public static final SelenideElement SELECT_WOS = $x("//select[@class='input' and @name='wos']");
    public static final SelenideElement SELECT_SCOPUS = $x("//select[@class='input' and @name='scopus']");
    public static final SelenideElement SELECT_WHITE = $x("//select[@class='input' and @name='white']");
    public static final SelenideElement SELECT_VAK = $x("//select[@class='input' and @name='vak']");
    public static final SelenideElement SELECT_RISC = $x("//select[@class='input' and @name='risc']");
    public static final SelenideElement SELECT_FTOPEN = $x("//select[@class='input' and @name='ftopen']");
    public static final SelenideElement CHECKBOX_RSCI = $x("//input[@type='checkbox' and @id='rsci']");
    public static final SelenideElement CHECKBOX_CORE_RISC = $x("//input[@type='checkbox' and @id='corerisc']");
    public static final SelenideElement CHECKBOX_IS_ACTIVE = $x("//input[@type='checkbox' and @id='isactive']");
    public static final SelenideElement CHECKBOX_DOAJ = $x("//input[@type='checkbox' and @id='doaj']");
    public static final SelenideElement CHECKBOX_FULL_TEXT = $x("//input[@type='checkbox' and @id='fulltext']");
    public static final SelenideElement CHECKBOX_ISSCIENTIFIC = $x("//input[@type='checkbox' and @id='isscientific']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@id='order' and @name='order']");
    public static final SelenideElement LINK_JOURNALS_COMPARISON = $x("//a[text()='Сравнение библиометрических показателей журналов']");
    public static final SelenideElement LINK_JOURNALS_PERSONAL_COLLECTIONS = $x("//a[text()='Персональные подборки журналов']");
    public static final SelenideElement LINK_JOURNALS_OPEN_ACCESS_LIST = $x("//a[text()='Список российских журналов, находящихся полностью или частично в открытом доступе']");
    public static final SelenideElement LINK_JOURNALS_ELECTRONIC_SUBSCRIPTION = $x("//a[text()='Подписка на российские научные журналы в электронном виде']");
    public static final SelenideElement LINK_JOURNALS_ADDED_TO_RINC_2025 = $x("//a[text()='Список журналов, включенных в РИНЦ с 2025 года']");
    public static final SelenideElement LINK_JOURNALS_EXCLUDED_FROM_RINC = $x("//a[text()='Cписок журналов, исключенных из РИНЦ']");
    public static final SelenideElement BTN_RESET_FROM = $x("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//div[@class='butred' and text()='Поиск']");

}
