package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.time.DurationUtils;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.sleep;


public class HomePageSteps extends HomePage {

    public HomePageSteps changecolour(){
        darkmodebutton.click();
        return this;
    }

    public HomePageSteps search_product(String name){
        searchinput.setValue(name).pressEnter();
        return this;
    }

    public HomePageSteps seealldeal(){
        seealldealbtn.click();
        return this;
    }
    public HomePageSteps location_click(){
        location_icon.click();
        return this;
    }
    public HomePageSteps enter_zip (String zip){
        enter_zip_input.setValue(zip);
        return this;
    }
    public HomePageSteps press_apply(){
        location_apply_btn.click();
        return this;
    }
    public HomePageSteps location_done(){
        location_done_btn.click();
        return this;
    }
    public HomePageSteps scroll_down_app(){
        app_downl_input.scrollTo();
        return this;
    }
    public HomePageSteps enter_mob_number(String number){
        app_downl_input.click();
        app_downl_input.setValue(number);
        return this;
    }
    public HomePageSteps press_send_link(){
        sendlink_btn.click();
        sleep(3000);
        return this;
    }
    public HomePageSteps scroll_to_success_msg(){
        down_app_element.scrollTo();
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
}
