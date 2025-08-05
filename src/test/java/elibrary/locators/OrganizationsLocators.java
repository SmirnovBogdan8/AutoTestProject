package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrganizationsLocators {
    public static final SelenideElement TXT_QUERY = $x("//input[@id='query']");
    public static final SelenideElement SELECT_TOWN = $x("//select[@class='input' and @name='town']");
    public static final SelenideElement SELECT_REGION_ID = $x("//select[@class='input' and @name='regionid']");
    public static final SelenideElement SELECT_COUNTRY_ID = $x("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@class='input' and @id='order']");
    public static final SelenideElement LINK_ORGANIZATIONS_INFO = $x("//a[text()='Информация для организаций']");
    public static final SelenideElement LINK_ORGANIZATIONS_METRICS_COMPARISON = $x("//a[text()='Сравнение библиометрических показателей организаций']");
    public static final SelenideElement BTN_RESET_FROM = $x("//a[text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//a[text()='Поиск']");
}
