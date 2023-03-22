package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class HomePage {
    public SelenideElement
    darkmodebutton = $("#darkLabel"),
    searchinput = $(".header2021-search-box").$(byTagName("input")),

    seealldealbtn = $(".section-bottom"),
    location_icon = $(".ico-map-marker"),
    location_apply_btn = $(byText("APPLY")),
    location_done_btn = $(".form-footer").$(".bg-orange"),
    app_downl_input = $(by("placeholder","Enter your phone number")),
    sendlink_btn =$(byText("Send Link")),
    down_app_element = $(byText("Download Our APP")),
    succsess_message = $(".subscribe-box-title font-l"),
    enter_zip_input = $(by("placeholder", "Enter a US zip code")),
    sign_in = $(by("aria-label","icon of my account")),
    submit_sign_in = $("#signInSubmit"),
    email_input_sign_in = $("#labeled-input-signEmail"),
    password_input = $("#labeled-input-password"),
    success_msg = $(byText("Great! We're texting you a link now.")),
    darkmode_func = $(".dark-mode-tooltip");





}


