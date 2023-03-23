import PageObject.SignUpPage;
import StepObject.SignUpSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.SignUpData.incor_email;
import static org.testng.Assert.assertTrue;

public class SignUpTests extends ChromeRunner {
    SignUpSteps sign_up_steps = new SignUpSteps();
    SignUpPage assert_data = new SignUpPage();
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("checking error massage for email field")
    public void check_signup_error (){
        sign_up_steps.press_login();
        sign_up_steps.Press_signup();
        sign_up_steps.enter_inc_email(incor_email);
        sign_up_steps.outs_click();
        assertTrue(assert_data.err_msg.is(Condition.visible));
    }

}
