package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SessionLocators {
    public static final SelenideElement LABLE_USER_NAME = $x("");
    public static final SelenideElement LABLE_BEGIN_SESSION = $x("");
    public static final SelenideElement LABLE_TIME_SESSION = $x("");
    public static final SelenideElement LINK_ACCOUNT = $x("Личный кабинет");
    public static final SelenideElement LINK_CLOSE_SESSION = $x("Закрыть сессию");

}
