package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

    @FindBy(xpath = "//a[text()='My Account']")
    WebElement myAccountDropDownToggle;
    @FindBy(xpath = "//a[@class='fl log-in pgLogIn logIn']")
    WebElement signInBtn;
    @FindBy(xpath = "//input[@id='login-input']")
    WebElement emailId;
    @FindBy(xpath = "//input[@class='yt-sme-mobile-input required_field email-login-box']")
    WebElement enterEmailId;
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
        //Thread.sleep(300);
        //To mouseover on sub signin button menu and click
        actions.moveToElement(signInBtn).click().perform();
        Thread.sleep(400);
    }

    public void enterEmaiIid(String username) throws InterruptedException {
        Thread.sleep(400);
        enterEmailId.sendKeys(username);
        Thread.sleep(400);
    }

    public void setContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(400);
    }

    public void enterPassword(String passwd) throws InterruptedException {
        Thread.sleep(300);
        password.sendKeys(passwd);
        Thread.sleep(400);
    }

    public void clickLogin() throws InterruptedException {
        Thread.sleep(400);
        loginButton.click();
    }
}
