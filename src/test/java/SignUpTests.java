import PageObject.SignUpPage;
import StepObject.SignUpSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.SignUpData.incor_email;
import static org.testng.Assert.assertTrue;

public class SignUpTests extends ChromeRunner {
    SignUpSteps sign_up_steps = new SignUpSteps();
    SignUpPage assert_data = new SignUpPage();
    @Test
    public void check_signup_error (){
        sign_up_steps.press_login();
        sign_up_steps.Press_signup();
        sign_up_steps.enter_inc_email(incor_email);
        sign_up_steps.outs_click();
        assertTrue(assert_data.err_msg.is(Condition.visible));
    }

}
