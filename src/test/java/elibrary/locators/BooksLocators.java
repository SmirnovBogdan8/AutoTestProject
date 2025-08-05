package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BooksLocators {
    public static final SelenideElement TXT_BOOK_NAME = $x("//input[@id='bookname']");
    public static final SelenideElement SELECT_BOOK_TYPE = $x("//select[@class='input' and @id='booktype']");
    public static final SelenideElement TXT_AUTHOR = $x("//input[@id='author']");
    public static final SelenideElement TXT_PUBLNAME = $x("//input[@id='publname']");
    public static final SelenideElement SELECT_LANGUAGE = $x("//select[@class='input' and @name='language']");
    public static final SelenideElement SELECT_COUNTRY_ID = $x("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_RUBRIC_CODE = $x("//select[@class='input' and @id='rubriccode']");
    public static final SelenideElement SELECT_YEARPUBL = $x("//select[@class='input' and @name='yearpubl']");
    public static final SelenideElement SELECT_FULLTEXT = $x("//select[@class='input' and @name='fulltext']");
    public static final SelenideElement SELECT_SHOW_OPTION = $x("//select[@class='input' and @id='show_option']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@class='input' and @id='order']");
    public static final SelenideElement LINK_SELECT_ALL = $x("//a[text()='Выделить все книги на этой странице']");
    public static final SelenideElement LINK_SELECT_REMOVE = $x("//a[text()='Снять выделение']");
    public static final SelenideElement LINK_BOOKS_ADD = $x("//a[text()='Добавить выделенные книги в подборку:']");
    public static final SelenideElement LINK_BOOKS_ADD_ALL = $x("//a[text()='Добавить все книги в указанную выше подборку']");
    public static final SelenideElement BTN_RESET_FROM = $x("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//div[@class='butred' and text()='Поиск']");
}
