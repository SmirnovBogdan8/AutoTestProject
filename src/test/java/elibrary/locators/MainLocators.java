
package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainLocators {
    public static final SelenideElement LINK_READERS = $("//a[text()='ЧИТАТЕЛЯМ']");
    public static final SelenideElement LINK_ORGANIZATIONS = $("//a[text()='ОРГАНИЗАЦИЯМ']");
    public static final SelenideElement LINK_PUBLISHING = $("//a[text()='ИЗДАТЕЛЬСТВАМ']");
    public static final SelenideElement LINK_AUTHORS = $("//a[text()='АВТОРАМ']");
    public static final SelenideElement LINK_LIBRARIES = $("//a[text()='БИБЛИОТЕКАМ']");
    public static final SelenideElement LINK_TELEGRAM = $("//a[text()='Официальный Telegram-канал']");
    public static final SelenideElement BLOCK_SEARCH = $("//span[@class='expandable' and text()='ПОИСК']");
    public static final SelenideElement BLOCK_LOGIN = $("//span[@class='expandable' and text()='ВХОД']");
    public static final SelenideElement BLOCK_NAVIGATE = $("//span[@class='expandable' and text()='НАВИГАТОР']");
    public static final SelenideElement BLOCK_SESSION = $("//span[@class='expandable' and text()='СЕССИЯ']");
    public static final SelenideElement BLOCK_CONTACTS = $("//span[@class='expandable' and text()='КОНТАКТЫ']");
}