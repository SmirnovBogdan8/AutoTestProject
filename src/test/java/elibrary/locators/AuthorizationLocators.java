package elibrary.locators;

import com.codeborne.selenide.SelenideElement;
import elibrary.utils.NetworkUtils;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationLocators {
    public static final SelenideElement TXT_LOGIN = $x("//input[@id='login']");
    public static final SelenideElement TXT_PASSWORD = $x("//input[@id='password']");
    public static final SelenideElement ICON_VISIBLE_PWD = $x("//a[@href='#' and @class='password-control']");
    public static final SelenideElement CHECKBOX_REMEMBER_ME = $x("//input[@type='checkbox' and @name='knowme']");
    public static final SelenideElement LINK_ACCESS_RULES = $x("//a[@href='/access_terms.asp' and text()='Правила доступа']");
    public static final SelenideElement LINK_REGISTRATION = $x("//a[text()='Регистрация']");
    public static final SelenideElement LINK_FORGOT_PWD = $x("//a[text()='Забыли пароль?']");
    public static final SelenideElement LINK_LOG_ORGANIZATION = $x("//a[text()='Вход через Вашу организацию']");
}
