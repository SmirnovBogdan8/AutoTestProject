package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NeuralSearchLocators {
    public static final SelenideElement TXT_QUERY = $("//input[@id='query']");
    public static final SelenideElement SELECT_DATE_PUBL = $("//select[@class='input' and @id='datepubl']");
    public static final SelenideElement SELECT_DATE_INSTALL = $("//select[@class='input' and @name='dateinstall']");
    public static final SelenideElement SELECT_CATEGORY = $("//select[@class='input' and @name='category']");
    public static final SelenideElement SELECT_GENRE = $("//select[@class='input' and @name='genre']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@class='input' and @id='order']");
    public static final SelenideElement BTN_SELECT_ALL_PUBLICATIONS = $("//a[text()='Выделить все публикации на этой странице']");
    public static final SelenideElement BTN_CLEAR_SELECTION = $("//a[text()='Снять выделение']");
    public static final SelenideElement BTN_ADD_SELECTED_TO_COLLECTION = $("//a[text()='Добавить выделенные публикации в подборку']");
    public static final SelenideElement BTN_ADD_ALL_TO_COLLECTION = $("//a[text()='Добавить все результаты поиска в подборку']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");
}
