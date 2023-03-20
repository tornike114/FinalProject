package StepObject;

import PageObject.HomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;


public class HomePageSteps extends HomePage {

    public static void  changecolour(){
        darkmodebutton.click();
    }

    public static void search_product(){
        searchinput.setValue("lenovo").pressEnter();
        sleep(2000);
    }
    public static void  close_popup(){
        popup_close.click();
    }

}
