package StepObject;

import PageObject.PcBuilerPage;
import io.qameta.allure.Step;

import static DataObject.PcBuilderData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class PcBuilderSteps extends PcBuilerPage {
    @Step("clicking on PC Builder section")
    public PcBuilderSteps enter_builder(){
        builder_element.click();
        return this;
    }
    @Step("choosing CPU section")
    public PcBuilderSteps cpu_click(){
        cpu_element.click();
        return this;
    }
    @Step("choosing on/off filter")
    public PcBuilderSteps checker_click(){
        comp_checker.click();
        return this;
    }
    @Step("hiding components section")
    public PcBuilderSteps arrow_right_click(){
        arrow_right.click();
        return this;
    }
    @Step("searching ryzen processor")
    public PcBuilderSteps add_processor (String processor){
        builder_srch_input.setValue(processor);
        return this;
    }
    @Step("selecting item")
    public PcBuilderSteps select_processor (){
        select_btn.click();
        return this;
    }
    @Step("removing item")
    public PcBuilderSteps item_remove(){
        item_remove_inp.click();
        return this;
    }
    @Step("clicking outside to view page")
    public PcBuilderSteps click_outside(){
        click_.click();
        return this;
    }

}
