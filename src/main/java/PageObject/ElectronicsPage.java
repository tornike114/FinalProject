package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class ElectronicsPage {
    public SelenideElement
    electronics_btn = $(".ico-headphones"),
    TV_btn = $(by("title","Televisions")),
    compare_element = $(".item-compare-box"),
    go_btn = $(".btn-alt"),
    search_in_tv_input =$("#SrchInDesc_top"),
    clear_all_btn = $(".button-clear-all"),
    scroll_to_element = $(by("title","How can we improve search on Newegg?")),
    lg_btn = $(by("title","LG TVs"));
    public ElementsCollection favorites = $$(".item-compare-box");
}

