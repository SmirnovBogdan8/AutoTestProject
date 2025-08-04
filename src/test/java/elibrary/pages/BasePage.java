package elibrary.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    @Step("Ввести текст '{text}' в поле")
    protected void inputText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).setValue(text);
    }

    @Step("Очистить поле и ввести текст '{text}'")
    protected void clearAndInputText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).clear();
        element.setValue(text);
    }

    @Step("Выбрать '{item}' из списка")
    protected void selectItem(SelenideElement selectElement, String item) {
        selectElement.selectOption(item);
    }

    @Step("Выбрать элемент по значению '{value}' из списка")
    protected void selectValue(SelenideElement selectElement, String value) {
        selectElement.selectOptionByValue(value);
    }

    @Step("{shouldBeChecked ? 'Отметить' : 'Снять отметку'} чекбокс")
    protected void setCheckbox(SelenideElement checkbox, boolean shouldBeChecked) {
        if (shouldBeChecked != checkbox.isSelected()) {
            checkbox.click();
        }
    }

    @Step("Выбрать радиокнопку")
    protected void clickRadio(SelenideElement radioButton) {
        radioButton.click();
    }

    @Step("Нажать на кнопку")
    protected void clickButton(SelenideElement button) {
        button.shouldBe(Condition.enabled).click();
    }

    @Step("Перейти по ссылке")
    protected void clickLink(SelenideElement link) {
        link.shouldBe(Condition.visible).click();
    }

    @Step("Перейти по ссылке с текстом '{linkText}'")
    protected void clickLinkByText(String linkText) {
        $(byText(linkText)).click();
    }

    @Step("Получить текст заголовка '{headerTag}'")
    protected String getHeaderText(String headerTag) {
        return $(headerTag).shouldBe(Condition.visible).text();
    }

    @Step("Получить текст лейбла")
    protected String getLabelText(SelenideElement label) {
        return label.shouldBe(Condition.visible).text();
    }

    @Step("Нажать на иконку")
    protected void clickIcon(SelenideElement icon) {
        icon.shouldBe(Condition.visible).click();
    }

    @Step("Нажать на иконку по селектору '{cssSelector}'")
    protected void clickIconByCss(String cssSelector) {
        $(cssSelector).click();
    }

    @Step("Нажать на изображение")
    protected void clickImage(SelenideElement image) {
        image.shouldBe(Condition.visible).click();
    }

    @Step("Получить alt-текст изображения")
    protected String getImageAltText(SelenideElement image) {
        return image.shouldBe(Condition.visible).getAttribute("alt");
    }

    @Step("Ожидать появления элемента")
    protected void waitForElement(SelenideElement element) {
        element.shouldBe(Condition.visible);
    }

    @Step("Проверить видимость элемента")
    protected boolean isElementDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }
}