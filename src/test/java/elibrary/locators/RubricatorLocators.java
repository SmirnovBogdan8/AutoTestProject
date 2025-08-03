package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RubricatorLocators {
    public static final SelenideElement TXT_QWD = $("//input[@id='qwd']");
    public static final SelenideElement RADIO_ALL = $("//input[@type='radio' and @value='all']");
    public static final SelenideElement RADIO_SEL = $("//input[@type='radio' and @value='sel']");
    //public static final SelenideElement BTN_ = $("");
    //public static final SelenideElement BTN_ = $("");
    //public static final SelenideElement BTN_ = $("");
    public static final SelenideElement LINK_CATALOG = $("//a[text()='Каталог журналов']");
}
