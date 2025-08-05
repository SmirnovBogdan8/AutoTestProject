
package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainLocators {
    public static final SelenideElement LINK_READERS = $x("//a[text()='ЧИТАТЕЛЯМ']");
    public static final SelenideElement LINK_ORGANIZATIONS = $x("//a[text()='ОРГАНИЗАЦИЯМ']");
    public static final SelenideElement LINK_PUBLISHING = $x("//a[text()='ИЗДАТЕЛЬСТВАМ']");
    public static final SelenideElement LINK_AUTHORS = $x("//a[text()='АВТОРАМ']");
    public static final SelenideElement LINK_LIBRARIES = $x("//a[text()='БИБЛИОТЕКАМ']");
    public static final SelenideElement LINK_TELEGRAM = $x("//a[text()='Официальный Telegram-канал']");
    public static final SelenideElement BLOCK_SEARCH = $x("//span[@class='expandable' and text()='ПОИСК']");
    public static final SelenideElement BLOCK_LOGIN = $x("//span[@class='expandable' and text()='ВХОД']");
    public static final SelenideElement BLOCK_NAVIGATE = $x("//span[@class='expandable' and text()='НАВИГАТОР']");
    public static final SelenideElement BLOCK_SESSION = $x("//span[@class='expandable' and text()='СЕССИЯ']");
    public static final SelenideElement BLOCK_CONTACTS = $x("//span[@class='expandable' and text()='КОНТАКТЫ']");
}