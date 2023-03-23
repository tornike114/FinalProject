package StepObject;

import PageObject.HomePage;
import PageObject.SignUpPage;

public class SignUpSteps extends SignUpPage {
    HomePage lgn_element = new HomePage();
    public SignUpSteps Press_signup(){
        signup_btn.click();
        return this;
    }
    public SignUpSteps press_login(){
        lgn_element.sign_in.click();
        return this;
    }
    public SignUpSteps enter_inc_email(String email){
        email_input.setValue(email);
        return this;
    }
    public  SignUpSteps outs_click(){
        clickoutside_element.click();
        return this;
    }
}
