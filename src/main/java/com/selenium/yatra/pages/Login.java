package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.utility.CustomException;
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

    public void signInUser() throws InterruptedException {
        Thread.sleep(400);
        Actions actions = new Actions(driver);
        //Hovering on my account menu
        actions.moveToElement(myAccountDropDownToggle);
        Thread.sleep(300);
        //To mouseover on sub sign in button menu and click
        actions.moveToElement(signInBtn).build().perform();
        Thread.sleep(400);
        signInBtn.click();
        Thread.sleep(400);
    }

    public void setEmailId(String username) throws InterruptedException {
        Thread.sleep(300);
        emailId.sendKeys(username);
        Thread.sleep(300);
    }

    public void continueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(400);
    }

    public void password(String passwd) throws InterruptedException {
        Thread.sleep(300);
        password.sendKeys(passwd);
        Thread.sleep(400);
    }

    public void loginButton() throws InterruptedException {
        Thread.sleep(400);
        loginButton.click();
    }
}
