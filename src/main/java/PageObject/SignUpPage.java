package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.*;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.*;

public class SignUpPage {
    public SelenideElement
    signup_btn = $(By.linkText("Sign Up")),
    err_msg = $(".form-error-message"),
    clickoutside_element = $(".signin-title"),
    text_to_check = $(".adpopup-injected"),
    email_input = $(by("type","email"));
}
