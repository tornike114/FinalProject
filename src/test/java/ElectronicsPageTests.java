import StepObject.ElectronicsSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class ElectronicsPageTests extends ChromeRunner {
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    HomePageTest login_element = new HomePageTest();
    @Test
    public void electronics_test (){
        login_element.login();
        electronicsSteps.click_electronics();
    }
}
