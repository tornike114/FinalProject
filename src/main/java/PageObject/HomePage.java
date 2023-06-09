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

    location_icon = $(".ico-map-marker"),
    location_apply_btn = $(byText("APPLY")),
    location_done_btn = $(".form-footer").$(".bg-orange"),
    app_downl_input = $(by("placeholder","Enter your phone number")),
    sendlink_btn =$(byText("Send Link")),
    lenovo_laptop = $(by("title","Lenovo IdeaPad 3 Laptop, 14.0 Inch FHD Display, Intel Core i7-1165G7 Processor, 12GB RAM, 512GB SSD, Intel Iris X Graphics, Bluetooth, Wi-Fi 6, Fingerprint Reader, Windows 11 Home, Arctic Grey, Cefesf")),
    add_to_cart_icon = $(".btn-wide",0),
    enter_zip_input = $(by("placeholder", "Enter a US zip code")),
    sign_in = $(by("aria-label","icon of my account")),
    submit_sign_in = $("#signInSubmit"),
    email_input_sign_in = $("#labeled-input-signEmail"),
    password_input = $("#labeled-input-password"),
    success_msg = $(byText("Great! We're texting you a link now.")),
    cart_check_text = $(byText("Add This Offer to Cart")),
    darkmode_func = $(".dark-mode-tooltip");





}


