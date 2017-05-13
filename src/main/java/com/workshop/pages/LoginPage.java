package com.workshop.pages;

import com.codeborne.selenide.Selenide;
import com.workshop.pages.domain.User;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Astarta on 12.05.2017.
 */
public class LoginPage {

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }
public MainPage LoginAs(User user){
    $("#LoginForm > input:nth-child(2)").val(user.getName());
    $("#LoginForm > input[type=\"password\"]:nth-child(5)").val(user.getPassword());
    $("#LoginForm > input[type=\"submit\"]:nth-child(7)").click();
    return new MainPage();
}

}
