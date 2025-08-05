package elibrary.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SearchLocators {
    public static final SelenideElement TXT_SEARCH = $x("//textarea[@name='ftext' and @class='inputr']");
    public static final SelenideElement CHECKBOX_WHERE_NAME = $x("//input[@type='checkbox' and @name='where_name']");
    public static final SelenideElement CHECKBOX_WHERE_ABSTRACT = $x("//input[@type='checkbox' and @name='where_abstract']");
    public static final SelenideElement CHECKBOX_WHERE_KEYWORDS = $x("//input[@type='checkbox' and @name='where_keywords']");
    public static final SelenideElement CHECKBOX_WHERE_AFFILIATION = $x("//input[@type='checkbox' and @name='where_affiliation']");
    public static final SelenideElement CHECKBOX_FULLTEXT = $x("//input[@type='checkbox' and @name='where_fulltext']");
    public static final SelenideElement CHECKBOX_ARTICLE = $x("//input[@type='checkbox' and @name='type_article']");
    public static final SelenideElement CHECKBOX_TYPE_BOOK = $x("//input[@type='checkbox' and @name='type_book']");
    public static final SelenideElement CHECKBOX_TYPE_CONF = $x("//input[@type='checkbox' and @name='type_conf']");
    public static final SelenideElement CHECKBOX_TYPE_PREPRINT = $x("//input[@type='checkbox' and @name='type_preprint']");
    public static final SelenideElement CHECKBOX_TYPE_DATASET = $x("//input[@type='checkbox' and @name='type_dataset']");
    public static final SelenideElement CHECKBOX_TYPE_DISSER = $x("//input[@type='checkbox' and @name='type_disser']");
    public static final SelenideElement CHECKBOX_TYPE_REPORT = $x("//input[@type='checkbox' and @name='type_report']");
    public static final SelenideElement CHECKBOX_TYPE_PATENT = $x("//input[@type='checkbox' and @name='type_patent']");
    public static final SelenideElement CHECKBOX_TYPE_GRANT = $x("//input[@type='checkbox' and @name='type_grant']");
    public static final SelenideElement SELECT_RUBRICS =  $x("//select[@class='inputr' and @name='rubrics']");
    public static final SelenideElement SELECT_AUTHORS =  $x("//select[@class='inputr' and @name='authors']");
    public static final SelenideElement SELECT_TITLES =  $x("//select[@class='inputr' and @name='titles']");
    public static final ElementsCollection LINK_ADD =  $$x("//a[text()='Добавить']");
    public static final ElementsCollection LINK_REMOVE =  $$x("//a[text()='Удалить']");
    public static final SelenideElement SELECT_ITEM_BOX_ID = $x("//select[@class='input' and @name='search_itemboxid']");
    public static final SelenideElement CHECKBOX_SEARCH_MORPH = $x("//input[@type='checkbox' and @name='search_morph']");
    public static final SelenideElement CHECKBOX_SEARCH_FREETEXT = $x("//input[@type='checkbox' and @name='search_freetext']");
    public static final SelenideElement CHECKBOX_SEARCH_FULLTEXT = $x("//input[@type='checkbox' and @name='search_fulltext']");
    public static final SelenideElement CHECKBOX_SEARCH_OPEN = $x("//input[@type='checkbox' and @name='search_open']");
    public static final SelenideElement CHECKBOX_SEARCH_RESULTS = $x("//input[@type='checkbox' and @name='search_results']");
    public static final SelenideElement SELECT_BEGIN_YEAR = $x("//select[@class='input' and @name='begin_year']");
    public static final SelenideElement SELECT_END_YEAR = $x("//select[@class='input' and @name='end_year']");
    public static final SelenideElement SELECT_ISSUES = $x("//select[@class='input' and @name='issues']");
    public static final SelenideElement SELECT_SORT_ORDER = $x("//select[@class='input' and @name='orderby']");
    public static final SelenideElement SELECT_ORDER = $x("//select[@class='input' and @name='order']");
    public static final SelenideElement SELECT_QUERY_BOX_ID = $x("//select[@class='input' and @name='queryboxid']");
    public static final SelenideElement LINK_DELETE_SAVED_QUERY = $x("//a[text()='Удалить сохраненный запрос']");
    public static final SelenideElement LINK_RENAME_SAVED_QUERY = $x("//a[text()='Переименовать сохраненный запрос']");
    public static final SelenideElement LINK_SAVE_CURRENT_QUERY = $x("//a[text()='Сохранить текущий запрос как:']");
    public static final SelenideElement LINK_SEARCH_QUERY_GUIDE = $x("//a[text()='Правила и примеры оформления поисковых запросов']");
    public static final SelenideElement SELECT_SAVE_BOX_ID = $x("//select[@class='input' and @name='save_queryboxid']");
    public static final SelenideElement BTN_RESET_FROM = $x("//a[text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $x("//a[text()='Поиск']");
}
