package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BaseClass {

    @FindBy(xpath = "//a[text()='My Account']")
    WebElement myAccountDropDownToggle;
    @FindBy(xpath = "//a[@id='SignUpBtn']")
    WebElement signUpBtn;
    @FindBy(xpath = "//input[@id='login-input']")
    WebElement userEmailId;
    @FindBy(xpath = "//button[@id='login-continue-btn']")
    WebElement continueButton;
    @FindBy(xpath = "//input[@id='signup-mobile-number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='signup-password']")
    WebElement signUpPassword;
    @FindBy(xpath = "//input[@id='signup-user-first-name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='signup-user-last-name']")
    WebElement lastName;
    @FindBy(xpath = "//label[@for='specialPromoNotif']")
    WebElement offerCheckbox;
    @FindBy(xpath = "//label[@for='whatsAppNotif']")
    WebElement whatsAppNotifCheckbox;
    @FindBy(xpath = "//button[@id=\"signup-form-continue-btn\"]")
    WebElement createAccoutBtn;
    @FindBy(id = "signup-user-designation")
    WebElement dropDownTitle;
    @FindBy(xpath = "//button[@id='verify-otp']")
    WebElement submitButton;

    //wait for maximum of 30 seconds until the elements specified by annotations is loaded
    public int TimeoutValue = 30;

    public SignUp(WebDriver localdriver) {
        PageFactory.initElements(localdriver, this);
    }

    public void signUpUser() throws InterruptedException {
        Thread.sleep(500);
        Actions actions = new Actions(driver);
        //Hovering on my account menu
        actions.moveToElement(myAccountDropDownToggle);
        Thread.sleep(500);
        //To mouseover on sub signup button menu and click
        actions.moveToElement(signUpBtn).click().perform();
    }

    public void enterEmaiIid(String username) throws InterruptedException {
        Thread.sleep(400);
        userEmailId.sendKeys(username);
        Thread.sleep(400);
    }

    public void setContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(400);
    }

    public void enterMobileNumber(String mobilenumber) throws InterruptedException {
        System.out.println("Current URL" + driver.getCurrentUrl());
        Thread.sleep(500);
        mobileNumber.sendKeys(mobilenumber);
    }

    public void enterPassword(String password) {
        signUpPassword.sendKeys(password);
    }

    public void setSelectTitle() {
        Select drpdwnTitle = new Select(dropDownTitle);
        drpdwnTitle.selectByVisibleText("Mr.");
    }

    public void enterFistAndLastName(String firstname, String lastname) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
    }

    public void offerAndPromocheckkbox() {
        // This will Toggle the Check box
        offerCheckbox.click();
        // Check whether the Check box is toggled on
        if (offerCheckbox.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        } else {
            System.out.println("Checkbox is Toggled Off");
        }
    }

    public void whatsAppNotifCheckbox() {
        // This will Toggle the Check box
        whatsAppNotifCheckbox.click();
        // Check whether the Check box is toggled on
        if (whatsAppNotifCheckbox.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        } else {
            System.out.println("Checkbox is Toggled Off");
        }
    }

    public void clickAccoutButton() throws InterruptedException {
        Thread.sleep(400);
        createAccoutBtn.click();
    }

}
