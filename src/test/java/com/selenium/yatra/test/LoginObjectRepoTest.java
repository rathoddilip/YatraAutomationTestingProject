package com.selenium.yatra.test;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.pages.LoginUsingObjectRepo;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.io.IOException;
@Feature("Login and LogOut from Yatra Application")
@Epic("Regression Testing")
public class LoginObjectRepoTest extends BaseClass {

    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Login")
    @Description("Login to application with valid credentials")
    @Test
    public void LoginToApplication() throws InterruptedException, IOException {
        LoginUsingObjectRepo loginUsingObjectRepo=new LoginUsingObjectRepo();
        loginUsingObjectRepo.signInUser();
        loginUsingObjectRepo.setEmailId(email);
        loginUsingObjectRepo.continueButton();
        loginUsingObjectRepo.password(password);
        loginUsingObjectRepo.loginButton();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Test LogOut")
    @Description("LogOut from application")
    @Test
    public void LogOutFromApplication() throws InterruptedException, IOException {
        LoginUsingObjectRepo loginUsingObjectRepo=new LoginUsingObjectRepo();
        loginUsingObjectRepo.signInUser();
        loginUsingObjectRepo.setEmailId(email);
        loginUsingObjectRepo.continueButton();
        loginUsingObjectRepo.password(password);
        loginUsingObjectRepo.loginButton();
        loginUsingObjectRepo.logoutUser();
    }
}
