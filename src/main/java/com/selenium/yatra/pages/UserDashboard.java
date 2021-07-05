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
    @FindBy(xpath = "//a[@title='One Way']")
    WebElement oneWay;

    @FindBy(xpath = "//input[@id='BE_flight_origin_city']")
    WebElement deparatureFrom;


    public UserDashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setOneWay() throws InterruptedException {
        oneWay.click();
    }

    public void setDeparatureFrom(String cityName) {
        String searchText = "Mumbai";
        //WebElement dropdown = driver.findElement(By.id("grdAvailableGroups"));
        deparatureFrom.click(); // assuming you have to click the "dropdown" to open it
        List<WebElement> options = deparatureFrom.findElements(By.tagName("li"));
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
