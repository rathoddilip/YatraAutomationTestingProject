package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {


    @Test
    public void setSignInTest() throws InterruptedException {
        Login login=new Login(driver);
        login.signInUser();
//        login.enterEmaiIid("diliprathod32@gmail.com");
//        login.setContinueButton();
//        login.enterPassword("Login@123");
//        login.clickLogin();

    }
    @Test
    public void enterEmailTest() throws InterruptedException {
        Login login=new Login(driver);
        login.signInUser();
        login.enterEmaiIid("diliprathod32@gmail.com");
    }
    @Test
    public void clickContinueTest() throws InterruptedException {
        Login login=new Login(driver);
        login.signInUser();
        login.enterEmaiIid("diliprathod32@gmail.com");
        login.setContinueButton();
    }
    @Test
    public void enterPasswordTest() throws InterruptedException {
        Login login=new Login(driver);
        login.signInUser();
        login.enterEmaiIid("diliprathod32@gmail.com");
        login.setContinueButton();
        login.enterPassword("Login@123");
    }
    @Test
    public void loginTest() throws InterruptedException {
        Login login=new Login(driver);
        login.signInUser();
        login.enterEmaiIid("diliprathod32@gmail.com");
        login.setContinueButton();
        login.enterPassword("Login@123");
        login.clickLogin();
    }
}
