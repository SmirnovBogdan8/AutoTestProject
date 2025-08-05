package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class KeywordsLocators {
    public static final SelenideElement TXT_BOOK_NAME = $x("//input[@id='qwd']");
    public static final SelenideElement SELECT_METRICS = $x("//select[@class='input' and @name='metrics']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@id='order' and @name='order']");
    public static final SelenideElement BTN_RESET_FROM = $x("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//div[@class='butred' and text()='Поиск']");
}
