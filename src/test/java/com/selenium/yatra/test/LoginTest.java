package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.Login;
import org.testng.annotations.Test;
import java.awt.*;

public class LoginTest extends BaseClass {

    @Test
    public void signInTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.signInUser();
    }

    @Test
    public void emailTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
    }

    @Test
    public void passwordTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
        login.password(password);
    }

    @Test
    public void loginTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
        login.password(password);
        login.loginButton();
    }
    public void menuBarIcon() throws InterruptedException, AWTException {
        loginTest();
        Login login= new Login(driver);
        login.menuBarHotelsIcon();
    }
}
