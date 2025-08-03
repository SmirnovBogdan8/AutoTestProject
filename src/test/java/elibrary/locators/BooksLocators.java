package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BooksLocators {
    public static final SelenideElement TXT_BOOK_NAME = $("//input[@id='bookname']");
    public static final SelenideElement SELECT_BOOK_TYPE = $("//select[@class='input' and @id='booktype']");
    public static final SelenideElement TXT_AUTHOR = $("//input[@id='author']");
    public static final SelenideElement TXT_PUBLNAME = $("//input[@id='publname']");
    public static final SelenideElement SELECT_LANGUAGE = $("//select[@class='input' and @name='language']");
    public static final SelenideElement SELECT_COUNTRY_ID = $("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_RUBRIC_CODE = $("//select[@class='input' and @id='rubriccode']");
    public static final SelenideElement SELECT_YEARPUBL = $("//select[@class='input' and @name='yearpubl']");
    public static final SelenideElement SELECT_FULLTEXT = $("//select[@class='input' and @name='fulltext']");
    public static final SelenideElement SELECT_SHOW_OPTION = $("//select[@class='input' and @id='show_option']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@class='input' and @id='order']");
    public static final SelenideElement LINK_SELECT_ALL = $("//a[text()='Выделить все книги на этой странице']");
    public static final SelenideElement LINK_SELECT_REMOVE = $("//a[text()='Снять выделение']");
    public static final SelenideElement LINK_BOOKS_ADD = $("//a[text()='Добавить выделенные книги в подборку:']");
    public static final SelenideElement LINK_BOOKS_ADD_ALL = $("//a[text()='Добавить все книги в указанную выше подборку']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");
}
