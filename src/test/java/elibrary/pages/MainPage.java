package elibrary.pages;

import elibrary.locators.MainLocators;
import io.qameta.allure.Step;

public class MainPage extends BasePage {
    @Step("Перейти в раздел поиска авторов")
    public MainPage viaAuthors(){
        clickLink(MainLocators.LINK_AUTHORS);
        return this;
    }
}