package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.apache.commons.lang3.time.DurationUtils;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.sleep;


public class HomePageSteps extends HomePage {
    @Step("changing colour to dark mode")

    public HomePageSteps changecolour(){
        darkmodebutton.click();
        return this;
    }
    @Step("entering lenovo to search")

    public HomePageSteps search_product(String name){
        searchinput.setValue(name).pressEnter();
        return this;
    }

@Step("click to location")
    public HomePageSteps location_click(){
        location_icon.click();
        return this;
    }
    @Step("entering zip code")
    public HomePageSteps enter_zip (String zip){
        enter_zip_input.setValue(zip);
        return this;
    }
    @Step("press apply button to confirm zip code")
    public HomePageSteps press_apply(){
        location_apply_btn.click();
        return this;
    }
    @Step("clicking on done button")
    public HomePageSteps location_done(){
        location_done_btn.click();
        return this;
    }
    @Step("scroll to app download feature")
    public HomePageSteps scroll_down_app(){
        app_downl_input.scrollTo();
        return this;
    }
    @Step("entering mobile number")
    public HomePageSteps enter_mob_number(String number){
        app_downl_input.click();
        app_downl_input.setValue(number);
        return this;
    }
    @Step("press send link button")
    public HomePageSteps press_send_link(){
        sendlink_btn.click();
        sleep(3000);
        return this;
    }

    public HomePageSteps signing_in(){
        sign_in.click();
        return this;
    }
    public HomePageSteps enter_email (String email){
        email_input_sign_in.setValue(email);
        return this;
    }
    public HomePageSteps press_login_button(){
        submit_sign_in.click();
        return this;
    }
    public HomePageSteps enter_password(String password){
        password_input.setValue(password);
        return this;
    }
    @Step("choosing product")
    public HomePageSteps press_lenovo(){
        lenovo_laptop.click();
        return this;
    }
    @Step("adding item to cart")
    public HomePageSteps adding_to_cart(){
        add_to_cart_icon.click();
        sleep(3000);
        return this;
    }
}
