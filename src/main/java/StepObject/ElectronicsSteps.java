package StepObject;

import PageObject.ElectronicsPage;
import io.qameta.allure.Step;

import static DataObject.ElectronicsData.lg_g2_search;

public class ElectronicsSteps extends ElectronicsPage {
    @Step("click electronics section")
    public ElectronicsSteps click_electronics (){
        electronics_btn.click();
        return this;
    }
    @Step("choose tv section")
    public ElectronicsSteps tv_section_click(){
        TV_btn.click();
        return this;
    }
    @Step("choose lg")
    public ElectronicsSteps choose_lg (){
        lg_btn.click();
        return this;
    }
    @Step("search lg model tv")
    public ElectronicsSteps search_lg(String lglg){
        search_in_tv_input.setValue(lglg);
        return this;
    }
    @Step("press go button")
    public ElectronicsSteps search_go(){
        go_btn.click();
        return this;
    }
    @Step("choosing items to compare")
    public ElectronicsSteps loop_favorites (){
        int count = favorites.size();
        for(int i =0;i<count;i++){
            favorites.get(i).click();
        }
        return this;
    }
    @Step("clearing items from compare list")
    public ElectronicsSteps clearall_method(){
        clear_all_btn.click();
        return this;
    }
    @Step("scroll to needed view")
    public ElectronicsSteps scroll_method(){
        scroll_to_element.scrollTo();
        return this;
    }

}
