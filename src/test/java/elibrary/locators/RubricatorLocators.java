package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RubricatorLocators {
    public static final SelenideElement TXT_QWD = $x("//input[@id='qwd']");
    public static final SelenideElement RADIO_ALL = $x("//input[@type='radio' and @value='all']");
    public static final SelenideElement RADIO_SEL = $x("//input[@type='radio' and @value='sel']");
    //public static final SelenideElement BTN_ = $x("");
    //public static final SelenideElement BTN_ = $x("");
    //public static final SelenideElement BTN_ = $x("");
    public static final SelenideElement LINK_CATALOG = $x("//a[text()='Каталог журналов']");
}
