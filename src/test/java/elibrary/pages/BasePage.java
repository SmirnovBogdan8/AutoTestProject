package elibrary.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    // 1. Работа с текстовыми полями
    protected void typeText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).setValue(text);
    }

    protected void clearAndType(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).clear();
        element.setValue(text);
    }

    // 2. Работа с выпадающими списками
    protected void selectOption(SelenideElement selectElement, String optionText) {
        selectElement.selectOption(optionText);
    }

    protected void selectOptionByValue(SelenideElement selectElement, String value) {
        selectElement.selectOptionByValue(value);
    }

    // 3. Работа с чекбоксами
    protected void setCheckbox(SelenideElement checkbox, boolean shouldBeChecked) {
        if (shouldBeChecked != checkbox.isSelected()) {
            checkbox.click();
        }
    }

    // 4. Работа с радиокнопками
    protected void selectRadio(SelenideElement radioButton) {
        radioButton.click();
    }

    // 5. Работа с кнопками
    protected void clickButton(SelenideElement button) {
        button.shouldBe(Condition.enabled).click();
    }

    // 6. Работа со ссылками
    protected void clickLink(SelenideElement link) {
        link.shouldBe(Condition.visible).click();
    }

    protected void clickLinkByText(String linkText) {
        $(byText(linkText)).click();
    }

    // 7. Получение текста
    protected String getHeaderText(String headerTag) {
        return $(headerTag).shouldBe(Condition.visible).text();
    }

    protected String getLabelText(SelenideElement label) {
        return label.shouldBe(Condition.visible).text();
    }

    // 8. Работа с иконками
    protected void clickIcon(SelenideElement icon) {
        icon.shouldBe(Condition.visible).click();
    }

    protected void clickIconByCss(String cssSelector) {
        $(cssSelector).click();
    }

    // 9. Работа с изображениями
    protected void clickImage(SelenideElement image) {
        image.shouldBe(Condition.visible).click();
    }

    protected String getImageAltText(SelenideElement image) {
        return image.shouldBe(Condition.visible).getAttribute("alt");
    }

    // 10. Общие методы
    protected void waitForElement(SelenideElement element) {
        element.shouldBe(Condition.visible);
    }

    protected boolean isElementDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }
}