package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavigateLocators {
    public static final SelenideElement LINK_MAGAZINES = $("//a[text()='ЖУРНАЛЫ']");
    public static final SelenideElement LINK_BOOKS = $("//a[text()='КНИГИ']");
    public static final SelenideElement LINK_PATENTS = $("//a[text()='ПАТЕНТЫ']");
    public static final SelenideElement LINK_SEARCH = $("//a[text()='ПОИСК']");
    public static final SelenideElement LINK_AUTHORS = $("//a[text()='АВТОРЫ']");
    public static final SelenideElement LINK_ORGANIZATIONS = $("//a[text()='ОРГАНИЗАЦИИ']");
    public static final SelenideElement LINK_KEY_WORDS = $("//a[text()='КЛЮЧЕВЫЕ СЛОВА']");
    public static final SelenideElement LINK_RUBRICS = $("//a[text()='РУБРИКАТОР']");
    public static final SelenideElement LINK_MAIN_PAGE = $("//a[text()='Начальная страница']");
}
