package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.utility.LogClass;
import com.selenium.yatra.utility.ObjectRepoLiabrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class LoginUsingObjectRepo extends BaseClass {

    Actions actions = new Actions(driver);

    public void signInUser() throws InterruptedException, IOException {

        Thread.sleep(400);

        //Hovering on my account menu
        LogClass.info("Mouse hovering on my account menu");
        actions.moveToElement(driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "myAccountDropDownToggle.xpath"))));

        Thread.sleep(300);
        //To mouseover on sub sign in button menu and click
        LogClass.info("Mouseover on sign in button menu");
        actions.moveToElement(driver.findElement(By.id(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "signInBtn.id")))).build().perform();
        Thread.sleep(400);
        LogClass.info("Clicking on signIn Button");
        driver.findElement(By.id(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "signInBtn.id"))).click();
        Thread.sleep(400);
    }

    @Step("Enter email id {0}")
    public void setEmailId(String username) throws InterruptedException, IOException {
        Thread.sleep(300);
        LogClass.info("Entering email id: " + username);
        driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "emailId.xpath"))).sendKeys(username);
        Thread.sleep(300);
    }

    @Step("Clicking on button")
    public void continueButton() throws InterruptedException, IOException {
        LogClass.info("Clicking on continue button");
        driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "continueButton.xpath"))).click();
        Thread.sleep(400);
    }

    @Step("Enter password {0}")
    public void password(String passwd) throws InterruptedException, IOException {
        Thread.sleep(300);
        LogClass.info("Entering password: " + passwd);
        driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "password.xpath"))).sendKeys(passwd);
        Thread.sleep(400);
    }

    @Step("Clicking on Login button")
    public void loginButton() throws InterruptedException, IOException {
        Thread.sleep(400);
        LogClass.info("Clicking on Login button");
        driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "loginButton.xpath"))).click();
        LogClass.info("Login Successfully");
        Thread.sleep(400);
    }

    @Step("logout from application")
    public void logoutUser() throws InterruptedException, IOException {
        Thread.sleep(400);
        //Hovering on my account menu
        LogClass.info("Mouse hovering on my account menu");
        actions.moveToElement(driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "hiDilipDropDownToggle.xpath"))));
        Thread.sleep(300);
        //To mouseover on sub Logout button menu and click
        LogClass.info("mouse hovering on logout sub menu");
        actions.moveToElement(driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "logoutLink.xpath")))).build().perform();
        LogClass.info("Clicking on sub menu logout");
        Thread.sleep(400);
        driver.findElement(By.xpath(ObjectRepoLiabrary.getLocatorProperty(propertyFilePath, "logoutLink.xpath"))).click();
        LogClass.info("Logout successfully");
        Thread.sleep(400);
    }
}
