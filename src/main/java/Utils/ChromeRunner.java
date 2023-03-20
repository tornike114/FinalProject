package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeMethod
    public void setUp(){
        System.setProperty("selenide.browserSize","1980x1080");
        open("https://www.newegg.com/");
    }
    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}