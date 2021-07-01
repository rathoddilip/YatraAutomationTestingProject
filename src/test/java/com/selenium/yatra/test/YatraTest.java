package com.selenium.yatra.test;


import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.LogOut;
import com.selenium.yatra.pages.Login;
import com.selenium.yatra.pages.SignUp;
import com.selenium.yatra.pages.UserDashboard;
import com.selenium.yatra.utility.MenuBar;
import com.selenium.yatra.utility.ReadExcelData;
import com.selenium.yatra.utility.YatraCustomListner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

@Listeners(YatraCustomListner.class)
public class YatraTest extends BaseClass {

    @Test
    public void setSignUpTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
    }

    @Test
    public void enterEmailTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
    }

    @Test
    public void clickContinueButtonTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.setContinueButton();
    }

    @Test
    public void setMobileNumberTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
    }

    @Test
    public void enterPasswordTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
    }

    @Test
    public void setSelectTitleTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
        signUp.setSelectTitle();
    }

    @Test
    public void enterFistAndLastNameTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
    }

    @Test
    public void offerAndPromocheckkboxTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckbox();
    }

    @Test
    public void whatsAppNotifCheckboxTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckbox();
        signUp.whatsAppNotifyCheckbox();
    }

    @Test
    public void clickAccoutButtonTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid(email);
        signUp.setContinueButton();
        signUp.enterMobileNumber(mobileNumber);
        signUp.enterPassword(password);
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckbox();
        signUp.whatsAppNotifyCheckbox();
        signUp.clickAccountButton();
    }

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
        //validation after user login
        System.out.println("Title:" + driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Yatra Account";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void logOut() throws InterruptedException, AWTException {
        LogOut logout = new LogOut(driver);
        loginTest();
        logout.logoutUser();
    }

    @Test
    public void menuBarIconTest() throws AWTException, InterruptedException {
        MenuBar menuBar = new MenuBar();
        loginTest();
        menuBar.menuBarHotelIconClick();
    }

    @Test
    public void searchFlight() throws InterruptedException, AWTException {
        UserDashboard userDashboard = new UserDashboard(driver);
        loginTest();
        userDashboard.setOneWay();
        userDashboard.setDeparatureFrom("mumbai");
    }

    @Test
    public void readDataSpreadSheet() throws IOException {
        ReadExcelData readExcelData=new ReadExcelData();

    }
}





