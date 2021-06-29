package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserDashboard extends BaseClass {

    @FindBy(xpath = "//div[@class='journey-details clearfix']")
    WebElement frameElement;
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
        driver.switchTo().frame(frameElement);
        oneWay.click();
    }

    public void setDeparatureFrom(String cityName) {
       // String searchText = "Mumbai";
        //WebElement dropdown = driver.findElement(By.id("grdAvailableGroups"));
        depFrom.click(); // assuming you have to click the "dropdown" to open it
        List<WebElement> options = depFrom.findElements(By.tagName("li"));
        for (WebElement option : options)
        {
            if (option.getText().equals(cityName))
            {
                option.click(); // click the desired option
                break;
            }
        }

    }
}
