package ui.steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import ui.service.ButtonService;
import ui.service.ButtonServiceImpl;
import ui.storage.MainPageStorage;

public class MainPageSteps {
    private final MainPageStorage mainPageStorage;
    private final ButtonService buttonService;

    public MainPageSteps() {
        this.mainPageStorage = new MainPageStorage();
        this.buttonService = new ButtonServiceImpl(mainPageStorage);
    }

    @Когда("^Ввести \"([^\"]*)\" в поле \"([^\"]*)\" на главной странице$")
    public void enterFieldMainPageStep(String text, String inputName) {
        mainPageStorage.getInputs().get(inputName).setValue(text);
    }

    @Когда("^Нажать кнопку \"([^\"]*)\" на главной странице$")
    public void clickMainPageButtonStep(String buttonName) {
        buttonService.click(buttonName);
    }

    @Тогда("^Проверить, что кнопка \"([^\"]*)\" на главной странице заблокирована$")
    public void checkMainPageButtonLockedStep(String buttonName) {
        Assert.assertTrue(buttonService.isDisabled(buttonName));
    }
}
