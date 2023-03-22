package Utils;

import PageObject.HomePage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeMethod
    public void setUp(){
        System.setProperty("selenide.browserSize","1980x1080");
        open("https://www.newegg.com/");
        SelenideElement popup_close = $(".close");
        popup_close.click();
        }

    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}