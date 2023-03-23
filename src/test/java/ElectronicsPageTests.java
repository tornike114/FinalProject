import StepObject.ElectronicsSteps;
import StepObject.PcBuilderSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.ElectronicsData.lg_g2_search;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.*;

public class ElectronicsPageTests extends ChromeRunner {
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    HomePageTest login_element = new HomePageTest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("checking electronics section")
    public void electronics_test (){
        login_element.login();
        electronicsSteps.click_electronics()
                .tv_section_click()
                .choose_lg();
        electronicsSteps.search_lg(lg_g2_search);
        assertEquals(electronicsSteps.search_in_tv_input.getValue(),lg_g2_search);
        electronicsSteps.search_go();
        electronicsSteps.scroll_method();
        electronicsSteps.loop_favorites()
                        .clearall_method();
    }
}
