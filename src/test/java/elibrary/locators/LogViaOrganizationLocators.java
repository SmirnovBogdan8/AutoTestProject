package elibrary.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LogViaOrganizationLocators {
    public static final SelenideElement LINK_UNIVERSITY_1 = $x("//a[text()='Санкт-Петербургский политехнический университет Петра Великого']");
    public static final SelenideElement LINK_UNIVERSITY_2 = $x("//a[text()='Санкт-Петербургский государственный университет']");
    public static final SelenideElement LINK_UNIVERSITY_3 = $x("//a[text()='Томский государственный университет']");
    public static final SelenideElement LINK_UNIVERSITY_4 = $x("//a[text()='Пермский национальный исследовательский политехнический университет']");
    public static final SelenideElement LINK_UNIVERSITY_5 = $x("//a[text()='Финансовый университет при Правительстве РФ']");
}
