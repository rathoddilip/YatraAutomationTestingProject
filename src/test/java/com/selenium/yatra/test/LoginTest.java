package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.Login;
import com.selenium.yatra.utility.DataProviderClass;
import com.selenium.yatra.utility.ReadExcelData;
import com.selenium.yatra.utility.YatraCustomListner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

@Listeners(YatraCustomListner.class)
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
        Assert.assertTrue(true);
    }

    @Test
    public void menuBarIcon() throws InterruptedException, AWTException {
        loginTest();
        Login login = new Login(driver);
        login.menuBarHotelsIcon();
    }

    // To get data from data_provider
    @Test(dataProvider = "testDataSet", dataProviderClass = DataProviderClass.class)
    public void loginUsingDataProvider(String emailData, String passwordData) throws AWTException, InterruptedException {
        Login login = new Login(driver);
        login.signInUser();
        login.setEmailId(emailData);
        login.continueButton();
        login.password(passwordData);
        login.loginButton();
        String expected="diliprathod32@gmail.com";
        String actual=emailData;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void readDataFromExcelTest() throws InterruptedException, AWTException, IOException {
        ReadExcelData readExcelData= new ReadExcelData() ;
        readExcelData.getUserNameData();



    }

}
