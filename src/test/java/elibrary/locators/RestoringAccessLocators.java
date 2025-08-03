package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RestoringAccessLocators {
    public static final SelenideElement TXT_EMAIL = $("//input[@id='email']");
    public static final SelenideElement TXT_LOGIN = $("//input[@id='login']");
    public static final SelenideElement TXT_PASSWORD = $("//input[@id='pass']");
    public static final SelenideElement TXT_SURNAME = $("//input[@id='surname']");
    public static final SelenideElement TXT_NAME = $("//input[@id='name']");
    public static final SelenideElement TXT_LASTNAME = $("//input[@id='lastname']");
    public static final SelenideElement LINK_USER_REGISTRATION = $("//a[text()='Регистрация пользователя']");
    public static final SelenideElement LINK_LIBRARY_RULES = $("//a[text()='Правила пользования библиотекой']");
    public static final SelenideElement LINK_RECOVER_CREDENTIALS = $("//a[text()='Как восстановить регистрационные данные?']");
    public static final SelenideElement BTN_SEND = $("//div[@class='butblue' and text()='Отправить запрос']");
}
