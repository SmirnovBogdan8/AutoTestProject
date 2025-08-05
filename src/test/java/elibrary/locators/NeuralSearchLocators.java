package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NeuralSearchLocators {
    public static final SelenideElement TXT_QUERY = $x("//input[@id='query']");
    public static final SelenideElement SELECT_DATE_PUBL = $x("//select[@class='input' and @id='datepubl']");
    public static final SelenideElement SELECT_DATE_INSTALL = $x("//select[@class='input' and @name='dateinstall']");
    public static final SelenideElement SELECT_CATEGORY = $x("//select[@class='input' and @name='category']");
    public static final SelenideElement SELECT_GENRE = $x("//select[@class='input' and @name='genre']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@class='input' and @id='order']");
    public static final SelenideElement LINK_SELECT_ALL_PUBLICATIONS = $x("//a[text()='Выделить все публикации на этой странице']");
    public static final SelenideElement LINK_CLEAR_SELECTION = $x("//a[text()='Снять выделение']");
    public static final SelenideElement LINK_ADD_SELECTED_TO_COLLECTION = $x("//a[text()='Добавить выделенные публикации в подборку']");
    public static final SelenideElement LINK_ADD_ALL_TO_COLLECTION = $x("//a[text()='Добавить все результаты поиска в подборку']");
    public static final SelenideElement BTN_RESET_FROM = $x("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//div[@class='butred' and text()='Поиск']");
}
