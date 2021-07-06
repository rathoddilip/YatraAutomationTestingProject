package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.LogOut;
import com.selenium.yatra.pages.Login;
import com.selenium.yatra.utility.DataProviderClass;
import com.selenium.yatra.utility.MenuBarIcon;
import com.selenium.yatra.utility.YatraCustomListner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners(YatraCustomListner.class)
public class LoginTest extends BaseClass {

    @Test
    public void signInTest() throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
    }

    @Test
    public void emailTest() throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
    }

    @Test
    public void passwordTest() throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
        login.password(password);
    }

    @Test
    public void loginTest() throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
        login.password(password);
        login.loginButton();
        Assert.assertTrue(true);
    }

    @Test
    public void menuBarIconTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(email);
        login.continueButton();
        login.password(password);
        login.loginButton();
        MenuBarIcon menuBarIcon = new MenuBarIcon();
        menuBarIcon.menuBarHotelIconClick();
    }

    @Test
    public void logOut() throws InterruptedException {
        LogOut logout = new LogOut(driver);
        loginTest();
        logout.logoutUser();
        Assert.assertTrue(true);
    }

    // To get data from data_provider
    @Test(dataProvider = "testDataSet", dataProviderClass = DataProviderClass.class)
    public void loginUsingDataProviderTest(String emailData, String passwordData) throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(emailData);
        login.continueButton();
        login.password(passwordData);
        login.loginButton();
        String expected = "diliprathod32@gmail.com";
        Assert.assertEquals(emailData, expected);
    }

    // Here we are calling the Data Provider object with its Name
    @Test(dataProvider = "testDataSetFromExcelFile", dataProviderClass = DataProviderClass.class)
    public void loginUsingDataProviderFromExcelFileTest(String emailData, String passwordData) throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(emailData);
        login.continueButton();
        login.password(passwordData);
        login.loginButton();
        LogOut logOut = new LogOut(driver);
        logOut.logoutUser();
        String expected = "diliprathod32@gmail.com";
        Assert.assertEquals(emailData, expected);
    }

    @Test
    @Parameters({"username", "password"})
    public void loginToApplicationByParameterTest(String username, String password) throws InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(username);
        login.continueButton();
        login.password(password);
        login.loginButton();
        String expected = "diliprathod32@gmail.com";
        Assert.assertEquals(username, expected);

    }
}
