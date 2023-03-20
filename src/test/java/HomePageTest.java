import StepObject.HomePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.$;

public class HomePageTest extends ChromeRunner {
    HomePageSteps Homepagesteps = new HomePageSteps();
@Test

    public void darkmode () {
    HomePageSteps.changecolour();
    }
  @Test
    public void search_lenovo (){
    HomePageSteps.close_popup();
    HomePageSteps.search_product();
    }

}



