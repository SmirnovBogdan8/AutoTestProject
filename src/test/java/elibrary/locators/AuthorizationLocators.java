package elibrary.locators;

import com.codeborne.selenide.SelenideElement;
import elibrary.utils.NetworkUtils;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationLocators {
    public static final SelenideElement TXT_LOGIN = $("//input[@id='login']");
    public static final SelenideElement TXT_PASSWORD = $("//input[@id='password']");
    public static final SelenideElement ICON_VISIBLE_PWD = $("//a[@href='#' and @class='password-control']");
    public static final SelenideElement CHECKBOX_REMEMBER_ME = $("//input[@type='checkbox' and @name='knowme']");
    public static final SelenideElement LINK_ACCESS_RULES = $("//a[@href='/access_terms.asp' and text()='Правила доступа']");
    public static final SelenideElement LINK_REGISTRATION = $("//a[text()='Регистрация']");
    public static final SelenideElement LINK_FORGOT_PWD = $("//a[text()='Забыли пароль?']");
    public static final SelenideElement LINK_LOG_ORGANIZATION = $("//a[text()='Вход через Вашу организацию']");
}
