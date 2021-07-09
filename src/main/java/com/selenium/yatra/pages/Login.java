package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.utility.LogClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {


    @FindBy(xpath = "//a[text()='My Account']")
    WebElement myAccountDropDownToggle;

    @FindBy(id = "signInBtn")
    WebElement signInBtn;

    @FindBy(xpath = "//input[@class='yt-sme-mobile-input required_field email-login-box']")
    WebElement emailId;

    @FindBy(xpath = "//button[@id='login-continue-btn']")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='main-btn']")
    WebElement loginButton;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Clicking on signIn button")
    public void signInUser() throws InterruptedException {

        Thread.sleep(400);
        Actions actions = new Actions(driver);
        //Hovering on my account menu
        LogClass.info("Mouse hovering on my account menu");
        actions.moveToElement(myAccountDropDownToggle);
        Thread.sleep(300);
        //To mouseover on sub sign in button menu and click
        LogClass.info("Mouseover on sign in button menu");
        actions.moveToElement(signInBtn).build().perform();
        Thread.sleep(400);
        LogClass.info("Clicking on signIn Button");
        signInBtn.click();
        Thread.sleep(400);
    }

    @Step("Enter email id {0}")
    public void setEmailId(String username) throws InterruptedException {
        Thread.sleep(300);
        LogClass.info("Entering email id");
        emailId.sendKeys(username);
        Thread.sleep(300);
    }

    @Step("Clicking on button")
    public void continueButton() throws InterruptedException {
        LogClass.info("Clicking on continue button");
        continueButton.click();
        Thread.sleep(400);
    }

    @Step("Enter password {0}")
    public void password(String passwd) throws InterruptedException {
        Thread.sleep(300);
        LogClass.info("Entering password");
        password.sendKeys(passwd);
        Thread.sleep(400);
    }

    @Step("Clicking on Login button")
    public void loginButton() throws InterruptedException {
        Thread.sleep(400);
        LogClass.info("Clicking on Login button");
        loginButton.click();
    }
}
