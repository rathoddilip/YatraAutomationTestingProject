package com.selenium.yatra.test;


import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.SignUp;

import org.testng.annotations.Test;

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
        signUp.enterEmaiIid("diliprathod31@gmail.com");
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
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
    }

    @Test
    public void enterPasswordTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
    }

    @Test
    public void setSelectTitleTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
        signUp.setSelectTitle();
    }

    @Test
    public void enterFistAndLastNameTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
    }

    @Test
    public void offerAndPromocheckkboxTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckkbox();
    }

    @Test
    public void whatsAppNotifCheckboxTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckkbox();
        signUp.whatsAppNotifCheckbox();
    }

    @Test
    public void clickAccoutButtonTest() throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        signUp.signUpUser();
        signUp.enterEmaiIid("diliprathod31@gmail.com");
        signUp.setContinueButton();
        signUp.enterMobileNumber("7756994045");
        signUp.enterPassword("Login@123");
        signUp.setSelectTitle();
        signUp.enterFistAndLastName("Dilip", "Rathod");
        signUp.offerAndPromocheckkbox();
        signUp.whatsAppNotifCheckbox();
        signUp.clickAccoutButton();
    }
}





