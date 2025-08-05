package elibrary.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorsTest{
    @Test
    public void beginTest(){
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        open("https://elibrary.ru");
        SelenideElement author = $x("//div[@class='butblue']");
        author.click();
        System.out.println("Привет мир");
    }
}
