package elibrary.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchLocators {
    public static final SelenideElement TXT_SEARCH = $("//textarea[@name='ftext' and @class='inputr']");
    public static final SelenideElement CHECKBOX_WHERE_NAME = $("//input[@type='checkbox' and @name='where_name']");
    public static final SelenideElement CHECKBOX_WHERE_ABSTRACT = $("//input[@type='checkbox' and @name='where_abstract']");
    public static final SelenideElement CHECKBOX_WHERE_KEYWORDS = $("//input[@type='checkbox' and @name='where_keywords']");
    public static final SelenideElement CHECKBOX_WHERE_AFFILIATION = $("//input[@type='checkbox' and @name='where_affiliation']");
    public static final SelenideElement CHECKBOX_FULLTEXT = $("//input[@type='checkbox' and @name='where_fulltext']");
    public static final SelenideElement CHECKBOX_ARTICLE = $("//input[@type='checkbox' and @name='type_article']");
    public static final SelenideElement CHECKBOX_TYPE_BOOK = $("//input[@type='checkbox' and @name='type_book']");
    public static final SelenideElement CHECKBOX_TYPE_CONF = $("//input[@type='checkbox' and @name='type_conf']");
    public static final SelenideElement CHECKBOX_TYPE_PREPRINT = $("//input[@type='checkbox' and @name='type_preprint']");
    public static final SelenideElement CHECKBOX_TYPE_DATASET = $("//input[@type='checkbox' and @name='type_dataset']");
    public static final SelenideElement CHECKBOX_TYPE_DISSER = $("//input[@type='checkbox' and @name='type_disser']");
    public static final SelenideElement CHECKBOX_TYPE_REPORT = $("//input[@type='checkbox' and @name='type_report']");
    public static final SelenideElement CHECKBOX_TYPE_PATENT = $("//input[@type='checkbox' and @name='type_patent']");
    public static final SelenideElement CHECKBOX_TYPE_GRANT = $("//input[@type='checkbox' and @name='type_grant']");
    public static final SelenideElement SELECT_RUBRICS =  $("//select[@class='inputr' and @name='rubrics']");
    public static final SelenideElement SELECT_AUTHORS =  $("//select[@class='inputr' and @name='authors']");
    public static final SelenideElement SELECT_TITLES =  $("//select[@class='inputr' and @name='titles']");
    public static final ElementsCollection LINK_ADD =  $$("//a[text()='Добавить']");
    public static final ElementsCollection LINK_REMOVE =  $$("//a[text()='Удалить']");
    public static final SelenideElement SELECT_ITEM_BOX_ID = $("//select[@class='input' and @name='search_itemboxid']");
    public static final SelenideElement CHECKBOX_SEARCH_MORPH = $("//input[@type='checkbox' and @name='search_morph']");
    public static final SelenideElement CHECKBOX_SEARCH_FREETEXT = $("//input[@type='checkbox' and @name='search_freetext']");
    public static final SelenideElement CHECKBOX_SEARCH_FULLTEXT = $("//input[@type='checkbox' and @name='search_fulltext']");
    public static final SelenideElement CHECKBOX_SEARCH_OPEN = $("//input[@type='checkbox' and @name='search_open']");
    public static final SelenideElement CHECKBOX_SEARCH_RESULTS = $("//input[@type='checkbox' and @name='search_results']");
    public static final SelenideElement SELECT_BEGIN_YEAR = $("//select[@class='input' and @name='begin_year']");
    public static final SelenideElement SELECT_END_YEAR = $("//select[@class='input' and @name='end_year']");
    public static final SelenideElement SELECT_ISSUES = $("//select[@class='input' and @name='issues']");
    public static final SelenideElement SELECT_SORT_ORDER = $("//select[@class='input' and @name='orderby']");
    public static final SelenideElement SELECT_ORDER = $("//select[@class='input' and @name='order']");
    public static final SelenideElement SELECT_QUERY_BOX_ID = $("//select[@class='input' and @name='queryboxid']");
    public static final SelenideElement LINK_DELETE_SAVED_QUERY = $("//a[text()='Удалить сохраненный запрос']");
    public static final SelenideElement LINK_RENAME_SAVED_QUERY = $("//a[text()='Переименовать сохраненный запрос']");
    public static final SelenideElement LINK_SAVE_CURRENT_QUERY = $("//a[text()='Сохранить текущий запрос как:']");
    public static final SelenideElement LINK_SEARCH_QUERY_GUIDE = $("//a[text()='Правила и примеры оформления поисковых запросов']");
    public static final SelenideElement SELECT_SAVE_BOX_ID = $("//select[@class='input' and @name='save_queryboxid']");
    public static final SelenideElement BTN_RESET_FROM = $("//a[text()='Очистить']");
    public static final SelenideElement BTN_SEARCH = $("//a[text()='Поиск']");
}
