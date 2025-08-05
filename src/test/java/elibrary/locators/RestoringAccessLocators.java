package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RestoringAccessLocators {
    public static final SelenideElement TXT_EMAIL = $x("//input[@id='email']");
    public static final SelenideElement TXT_LOGIN = $x("//input[@id='login']");
    public static final SelenideElement TXT_PASSWORD = $x("//input[@id='pass']");
    public static final SelenideElement TXT_SURNAME = $x("//input[@id='surname']");
    public static final SelenideElement TXT_NAME = $x("//input[@id='name']");
    public static final SelenideElement TXT_LASTNAME = $x("//input[@id='lastname']");
    public static final SelenideElement LINK_USER_REGISTRATION = $x("//a[text()='Регистрация пользователя']");
    public static final SelenideElement LINK_LIBRARY_RULES = $x("//a[text()='Правила пользования библиотекой']");
    public static final SelenideElement LINK_RECOVER_CREDENTIALS = $x("//a[text()='Как восстановить регистрационные данные?']");
    public static final SelenideElement BTN_SEND = $x("//div[@class='butblue' and text()='Отправить запрос']");
}
