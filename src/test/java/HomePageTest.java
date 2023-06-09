import StepObject.HomePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.*;

public class HomePageTest extends ChromeRunner {
    HomePageSteps homepagesteps = new HomePageSteps();
@Test
@Severity(SeverityLevel.CRITICAL)
@Description("checking login")

    public void login () {
    homepagesteps.changecolour();
    assertEquals(homepagesteps.darkmode_func.getText(),mode_text,"colour changing functionality");
    homepagesteps.signing_in()
            .enter_email(email);
    assertEquals(homepagesteps.email_input_sign_in.getValue(),email);
    homepagesteps.press_login_button()
            .enter_password(password)
            .press_login_button();
    }
  @Test
  @Severity(SeverityLevel.NORMAL)
  @Description("checking location choosing and appdownload link")
    public void location_and_link (){
      homepagesteps.changecolour()
              .location_click()
              .enter_zip(zip)
              .press_apply()
              .location_done()
              .scroll_down_app()
              .enter_mob_number(mob_number)
              .press_send_link();
      assertTrue(homepagesteps.success_msg.is(Condition.visible));
     }
     @Test
     @Severity(SeverityLevel.NORMAL)
     @Description("searching and adding item to cart")
     public void search_and_add (){
    homepagesteps.search_product(search_lenovo);
    homepagesteps.press_lenovo();
    homepagesteps.adding_to_cart();
    assertTrue(homepagesteps.cart_check_text.is(Condition.visible));

     }

}



