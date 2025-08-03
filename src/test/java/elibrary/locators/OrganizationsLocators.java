package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrganizationsLocators {
    public static final SelenideElement TXT_QUERY = $("//input[@id='query']");
    public static final SelenideElement SELECT_TOWN = $("//select[@class='input' and @name='town']");
    public static final SelenideElement SELECT_REGION_ID = $("//select[@class='input' and @name='regionid']");
    public static final SelenideElement SELECT_COUNTRY_ID = $("//select[@class='input' and @name='countryid']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@class='input' and @id='sortorder']");
    public static final SelenideElement SELECT_ORDER = $("//select[@class='input' and @id='order']");
    public static final SelenideElement LINK_ORGANIZATIONS_INFO = $("//a[text()='Информация для организаций']");
    public static final SelenideElement LINK_ORGANIZATIONS_METRICS_COMPARISON = $("//a[text()='Сравнение библиометрических показателей организаций']");
    public static final SelenideElement BTN_RESET_FROM = $("//a[text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//a[text()='Поиск']");
}
