package StepObject;

import PageObject.ElectronicsPage;

public class ElectronicsSteps extends ElectronicsPage {
    public ElectronicsPage click_electronics (){
        electronics_btn.click();
        return this;
    }
   /* public ElectronicsPage enter_password(){

    }*/
}
