package com.addressbook.test;

import com.codeborne.selenide.Configuration;
import com.workshop.pages.LoginPage;
import com.workshop.pages.domain.User;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;


/**
 * Created by Astarta on 13.05.2017.
 */
public class LoginTest1 {
    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://localhost/addressbook";
    }


    @Test
    public void testCanLoginToAddressbook(){
        User user = new User("admin", "secret");
        new LoginPage()
                .open()
                .LoginAs(user).logo.shouldHave(text("Number of results"));
    }
}
