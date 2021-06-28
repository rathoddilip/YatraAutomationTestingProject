package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboard extends BaseClass {

    @FindBy(xpath = "//a[@class='blur_class type-active']")
    WebElement oneWay;

    @FindBy(xpath = "//ul[@class='from-to dflex w94 clearfix safariFix focus-on-field focus-field-depart-city']")
    WebElement deparatureFrom;
    @FindBy(xpath = "//input[@id='BE_flight_origin_city']")
    WebElement depFrom;

    public UserDashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setOneWay() throws InterruptedException {
        Thread.sleep(200);
        oneWay.click();
    }

    public void setDeparatureFrom(String cityName) {
        depFrom.sendKeys(cityName);
    }
}
