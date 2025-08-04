package elibrary.pages;

import elibrary.locators.AuthorsLocators;
import io.qameta.allure.Step;

public class AuthorsPage extends BasePage {
    @Step("Указать в поле Фамилия '{surname}'")
    public AuthorsPage inputSurname(String surname){
        inputText(AuthorsLocators.TXT_SURNAME, surname);
        return this;
    }

    @Step("Указать персональный идентификатор автора")
    public AuthorsPage setAuthorIdentifier(String selectCodeId, String inputId){
        selectItem(AuthorsLocators.SELECT_CODE_TYPE, selectCodeId);
        inputText(AuthorsLocators.TXT_CODE_VALUE, inputId);
        return this;
    }

    @Step("Выбрать город")
    public AuthorsPage selectCity(String city){
        selectItem(AuthorsLocators.SELECT_TOWN, city);
        return this;
    }

    @Step("Выбрать страну")
    public AuthorsPage selectCountry(String country){
        selectItem(AuthorsLocators.SELECT_COUNTRY, country);
        return this;
    }

    @Step("Искать в аффилиациях авторов в публикациях")
    public AuthorsPage checkAffiliationAuthors(){
        setCheckbox(AuthorsLocators.CHECKBOX_INAFFIL, true);
        return this;
    }

    /*@Step("Выбрать организацию")
    public AuthorsPage selectOrganization(String organization, String city){
        clickButton(AuthorsLocators.BTN_SELECT_ORGANIZATION);

        return this;
    }*/

    @Step("Выбрать группу авторов")
    public AuthorsPage selectGroupAuthor(String groupAuthor){
        selectItem(AuthorsLocators.SELECT_AUTHOR_BOX, groupAuthor);
        return this;
    }

    @Step("Учитывать рубрики из анкеты автора")
    public AuthorsPage checkRubricsAuthors(){
        setCheckbox(AuthorsLocators.CHECKBOX_RUBRIC_INREG, true);
        return this;
    }

    @Step("Выбрать тематику")
    public AuthorsPage selectTheme(String theme){
        selectItem(AuthorsLocators.SELECT_THEME, theme);
        return this;
    }

    @Step("Выбрать показатель")
    public AuthorsPage selectMetric(String metric){
        selectItem(AuthorsLocators.SELECT_METRIC, metric);
        return this;
    }

    @Step("Показывать только авторов, имеющих публикации")
    public AuthorsPage checkPublicAuthor(){
        setCheckbox(AuthorsLocators.CHECKBOX_SHOW_NOPUBL, true);
        return this;
    }

    @Step("Выбрать сортировку")
    public AuthorsPage selectSort(String sort){
        selectItem(AuthorsLocators.SELECT_SORT_ORDER, sort);
        return this;
    }

    @Step("Выбрать порядок")
    public AuthorsPage selectOrder(String order){
        selectItem(AuthorsLocators.SELECT_ORDER, order);
        return this;
    }

    @Step("Перейти по ссылке 'Инструкция для авторов'")
    public AuthorsPage clickLink(){
        clickLink(AuthorsLocators.LINK_AUTHORS_TUTORIAL);
        return this;
    }

    @Step("Очистить форму")
    public AuthorsPage clickClear() {
        clickButton(AuthorsLocators.BTN_RESET_FROM);
        return this;
    }

    @Step("Поиск")
    public AuthorsPage clickSearch() {
        clickButton(AuthorsLocators.BTN_SEARCH);
        return this;
    }
}