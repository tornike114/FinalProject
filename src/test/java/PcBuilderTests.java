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
        pcbuildersteps.enter_builder();
        pcbuildersteps.cpu_click();
        pcbuildersteps.arrow_right_click();
        pcbuildersteps.checker_click();
        pcbuildersteps.add_processor(ryzen_processor);
        assertEquals(pcbuildersteps.builder_srch_input.getValue(),ryzen_processor);
        pcbuildersteps.select_processor();
        pcbuildersteps.item_remove();
        pcbuildersteps.click_outside();
    }
}
