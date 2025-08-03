package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LogViaOrganizationLocators {
    public static final SelenideElement LINK_UNIVERSITY_1 = $("//a[text()='Санкт-Петербургский политехнический университет Петра Великого']");
    public static final SelenideElement LINK_UNIVERSITY_2 = $("//a[text()='Санкт-Петербургский государственный университет']");
    public static final SelenideElement LINK_UNIVERSITY_3 = $("//a[text()='Томский государственный университет']");
    public static final SelenideElement LINK_UNIVERSITY_4 = $("//a[text()='Пермский национальный исследовательский политехнический университет']");
    public static final SelenideElement LINK_UNIVERSITY_5 = $("//a[text()='Финансовый университет при Правительстве РФ']");
}
