package StepObject;

import PageObject.PcBuilerPage;

import static DataObject.PcBuilderData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class PcBuilderSteps extends PcBuilerPage {
    public PcBuilerPage enter_builder(){
        builder_element.click();
        return this;
    }
    public PcBuilerPage cpu_click(){
        cpu_element.click();
        return this;
    }
    public PcBuilerPage checker_click(){
        comp_checker.click();
        return this;
    }
    public PcBuilerPage arrow_right_click(){
        arrow_right.click();
        return this;
    }
    public PcBuilerPage add_processor (String ryzen_processor){
        builder_srch_input.setValue(ryzen_processor);
        return this;
    }
    public PcBuilerPage select_processor (){
        select_btn.click();
        return this;
    }
    public PcBuilerPage item_remove(){
        item_remove_inp.click();
        return this;
    }
    public PcBuilerPage click_outside(){
        click_.click();
        sleep(7000);
        return this;
    }

}
