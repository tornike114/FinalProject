package StepObject;

import PageObject.PcBuilerPage;

import static DataObject.PcBuilderData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class PcBuilderSteps extends PcBuilerPage {
    public PcBuilderSteps enter_builder(){
        builder_element.click();
        return this;
    }
    public PcBuilderSteps cpu_click(){
        cpu_element.click();
        return this;
    }
    public PcBuilderSteps checker_click(){
        comp_checker.click();
        return this;
    }
    public PcBuilderSteps arrow_right_click(){
        arrow_right.click();
        return this;
    }
    public PcBuilderSteps add_processor (String processor){
        builder_srch_input.setValue(processor);
        return this;
    }
    public PcBuilderSteps select_processor (){
        select_btn.click();
        return this;
    }
    public PcBuilderSteps item_remove(){
        item_remove_inp.click();
        return this;
    }
    public PcBuilderSteps click_outside(){
        click_.click();
        return this;
    }

}
