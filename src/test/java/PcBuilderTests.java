import StepObject.PcBuilderSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.PcBuilderData.ryzen_processor;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;


public class PcBuilderTests extends ChromeRunner {
    PcBuilderSteps pcbuildersteps = new PcBuilderSteps();
    @Test
    public void Pcbuilder(){
        pcbuildersteps.enter_builder()
                .cpu_click()
                .arrow_right_click()
                .checker_click()
                .add_processor(ryzen_processor);
        assertEquals(pcbuildersteps.builder_srch_input.getValue(),ryzen_processor);
        pcbuildersteps.select_processor()
                .item_remove()
                .click_outside();
    }
}
