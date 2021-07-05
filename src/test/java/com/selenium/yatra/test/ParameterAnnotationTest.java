package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.Login;
import com.selenium.yatra.utility.YatraCustomListner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(YatraCustomListner.class)
public class ParameterAnnotationTest extends BaseClass {

    @Test
    @Parameters({"username", "password"})
    public void loginToYatraApplicationByParameterTest(String username, String password) throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(username);
        login.continueButton();
        login.password(password);
        login.loginButton();
    }
}