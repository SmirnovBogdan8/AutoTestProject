package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SessionLocators {
    public static final SelenideElement LABLE_USER_NAME = $("");
    public static final SelenideElement LABLE_BEGIN_SESSION = $("");
    public static final SelenideElement LABLE_TIME_SESSION = $("");
    public static final SelenideElement LINK_ACCOUNT = $("Личный кабинет");
    public static final SelenideElement LINK_CLOSE_SESSION = $("Закрыть сессию");

}
