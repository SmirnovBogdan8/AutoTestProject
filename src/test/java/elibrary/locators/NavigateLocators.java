package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NavigateLocators {
    public static final SelenideElement LINK_MAGAZINES = $x("//a[text()='ЖУРНАЛЫ']");
    public static final SelenideElement LINK_BOOKS = $x("//a[text()='КНИГИ']");
    public static final SelenideElement LINK_PATENTS = $x("//a[text()='ПАТЕНТЫ']");
    public static final SelenideElement LINK_SEARCH = $x("//a[text()='ПОИСК']");
    public static final SelenideElement LINK_AUTHORS = $x("//a[text()='АВТОРЫ']");
    public static final SelenideElement LINK_ORGANIZATIONS = $x("//a[text()='ОРГАНИЗАЦИИ']");
    public static final SelenideElement LINK_KEY_WORDS = $x("//a[text()='КЛЮЧЕВЫЕ СЛОВА']");
    public static final SelenideElement LINK_RUBRICS = $x("//a[text()='РУБРИКАТОР']");
    public static final SelenideElement LINK_MAIN_PAGE = $x("//a[text()='Начальная страница']");
}
