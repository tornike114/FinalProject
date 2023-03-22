package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class PcBuilerPage {
    public SelenideElement
    builder_element =$("#trendingBanner_671801"),
    cpu_element = $(".diy-cpu"),
    comp_checker = $(".form-toggle-tool",0),
    arrow_right = $(by("data-dismiss","modal")),
    builder_srch_input = $("#SrchInDesc_top"),
    select_btn = $(".item-button-area",0),
    item_remove_inp = $(".item-remove"),
    click_ = $("#modal-pc-builder");


}
