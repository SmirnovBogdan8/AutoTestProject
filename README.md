
### **📌 Стиль именования элементов (шаблон `{ТИП_ЭЛЕМЕНТА}_{НАЗНАЧЕНИЕ}`)**  
Используется **UPPER_SNAKE_CASE** для констант и **четкие префиксы**, обозначающие тип элемента.  

| **Тип элемента**         | **Префикс/Шаблон**      | **Пример**                 | **Описание**                                |
|--------------------------|-------------------------|----------------------------|---------------------------------------------|
| **Текстовое поле**       | `TXT_{NAME}`            | `INPUT_TXT_USERNAME`       | Поле ввода текста (`<input type="text">`)   |
| **Выпадающий список**    | `SELECT_{NAME}`         | `SELECT_COUNTRY`           | `<select>` или кастомный дропдаун           |
| **Чекбокс**              | `CHECKBOX_{NAME}`       | `CHECKBOX_AGREEMENT`       | Чекбокс (`<input type="checkbox">`)         |
| **Радио-кнопка**         | `RADIO_{NAME}`          | `RADIO_GENDER_MALE`        | Радиокнопка (`<input type="radio">`)        |
| **Кнопка**               | `BTN_{ACTION}`          | `BTN_SUBMIT`, `BTN_CANCEL` | Кнопка (`<button>` или `<input type="button">`) |
| **Ссылка**               | `LINK_{DESTINATION}`    | `LINK_FORGOT_PASSWORD`     | Гиперссылка (`<a href="">`)                 |
| **Заголовок**            | `HEADER_{TEXT}`         | `HEADER_WELCOME`           | Заголовок (`<h1>`, `<h2>`, etc.)            |
| **Текст (label/span)**   | `LABLE_{CONTENT}`       | `TEXT_ERROR_MESSAGE`       | Произвольный текст на странице              |
| **Иконка**               | `ICON_{NAME}`           | `ICON_SEARCH`              | Иконка (обычно `<svg>` или `<i>`)           |
| **Картинка**             | `IMG_{NAME}`            | `IMG_LOGO`                 | Изображение (`<img>`)                       |
| **Блок/Контейнер**       | `BLOCK_{NAME}`          | `BLOCK_USER_PROFILE`       | Обертка для группы элементов (`<div>`)      |
| **Таблица**              | `TABLE_{NAME}`          | `TABLE_ORDER_HISTORY`      | HTML-таблица (`<table>`)                    |
| **Модальное окно**       | `MODAL_{NAME}`          | `MODAL_CONFIRMATION`       | Попап/диалоговое окно                       |
| **Список веб-элементов** | `LIST_{ELEMENT}_{NAME}` | `LIST_BTN_FILTER`          | Объект ElementsCollection                   |

### **📌 Стиль проектирования locators, page и test**
### 1. Locators
Классы содержат локаторы элементов:
```java
public class LoginLocators {
    public static final SelenideElement USERNAME = $("#username");
    public static final SelenideElement PASSWORD = $("#password");
}
```

### 2. Page Objects
Инкапсулируют взаимодействие со страницами:
```java
public class LoginPage {
    public LoginPage enterCredentials(String user, String pass) {
        LoginLocators.USERNAME.setValue(user);
        LoginLocators.PASSWORD.setValue(pass);
        return this;
    }
}
```

### 3. Тесты
Пример тестового класса:
```java
class LoginTest {
    @Test
    void shouldLoginSuccessfully() {
        new LoginPage()
            .open()
            .enterCredentials("admin", "pass123")
            .submit();
        
        assertEquals("/dashboard", WebDriverRunner.url());
    }
}
```