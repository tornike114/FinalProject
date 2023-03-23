package StepObject;

import PageObject.HomePage;
import PageObject.SignUpPage;
import io.qameta.allure.Step;

public class SignUpSteps extends SignUpPage {
    HomePage lgn_element = new HomePage();
    @Step("press sign up")
    public SignUpSteps Press_signup(){
        signup_btn.click();
        return this;
    }
    @Step("click signin/register")
    public SignUpSteps press_login(){
        lgn_element.sign_in.click();
        return this;
    }
    @Step("entering incorrect email")
    public SignUpSteps enter_inc_email(String email){
        email_input.setValue(email);
        return this;
    }
    @Step("click to see error message")
    public  SignUpSteps outs_click(){
        clickoutside_element.click();
        return this;
    }
}
