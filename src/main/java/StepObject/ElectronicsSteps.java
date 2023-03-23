package StepObject;

import PageObject.ElectronicsPage;

import static DataObject.ElectronicsData.lg_g2_search;

public class ElectronicsSteps extends ElectronicsPage {
    public ElectronicsSteps click_electronics (){
        electronics_btn.click();
        return this;
    }
    public ElectronicsSteps tv_section_click(){
        TV_btn.click();
        return this;
    }
    public ElectronicsSteps choose_lg (){
        lg_btn.click();
        return this;
    }
    public ElectronicsSteps search_lg(String lglg){
        search_in_tv_input.setValue(lglg);
        return this;
    }
    public ElectronicsSteps search_go(){
        go_btn.click();
        return this;
    }
    public ElectronicsSteps loop_favorites (){
        int count = favorites.size();
        for(int i =0;i<count;i++){
            favorites.get(i).click();
        }
        return this;
    }
    public ElectronicsSteps clearall_method(){
        clear_all_btn.click();
        return this;
    }
    public ElectronicsSteps scroll_method(){
        scroll_to_element.scrollTo();
        return this;
    }

}
