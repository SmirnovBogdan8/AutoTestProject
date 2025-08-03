package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class KeywordsLocators {
    public static final SelenideElement TXT_BOOK_NAME = $("//input[@id='qwd']");
    public static final SelenideElement SELECT_METRICS = $("//select[@class='input' and @name='metrics']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@id='sortorder' and @name='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@id='order' and @name='order']");
    public static final SelenideElement BTN_RESET_FROM = $("//div[@class='butblue' and text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//div[@class='butred' and text()='Поиск']");
}
