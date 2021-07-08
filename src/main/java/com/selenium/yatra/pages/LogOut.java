package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import com.selenium.yatra.utility.LogClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends BaseClass {

    @FindBy(xpath = "//a[@class='dropdown-toggle loginUserName']")
    WebElement hiDilipDropDownToggle;

    @FindBy(xpath = "//a[@id='logOut']")
    WebElement logoutLink;

    public LogOut(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logoutUser() throws InterruptedException {
        Thread.sleep(400);
        Actions actions = new Actions(driver);
        //Hovering on my account menu
        LogClass.info("Mouse hovering on my account menu");
        actions.moveToElement(hiDilipDropDownToggle);
        Thread.sleep(300);
        //To mouseover on sub Logout button menu and click
        LogClass.info("mouse hovering on logout sub menu");
        actions.moveToElement(logoutLink).build().perform();
        LogClass.info("Clicking on sub menu logout");
        logoutLink.click();
        Thread.sleep(400);
    }
}
