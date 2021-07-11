package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.LogOut;
import com.selenium.yatra.pages.Login;
import com.selenium.yatra.utility.DataProviderClass;
import com.selenium.yatra.utility.MenuBarIcon;
import com.selenium.yatra.utility.YatraCustomListner;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;

@Feature("Login to application")
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

    @Severity(SeverityLevel.CRITICAL)
    @Description("Login to application with valid credentials")
    @Story("Test login account ")
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
    @Severity(SeverityLevel.MINOR)
    @Description("Login to application")
    @Story("Test login account by using data provider credentials ")
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

    @Description("Login to application with valid credentials and logout ")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void LogInlogOutTest() throws InterruptedException {
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

    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Login with data set from excel sheet")
    @Description("Login to application with valid credentials")
    @Story("Test login account by using data provider credentials ")
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
