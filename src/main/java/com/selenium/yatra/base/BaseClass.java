package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static String email = "abc@gmail.com";
    public static String password = "abc@123";
    public static String mobileNumber = "92558655231";

    @BeforeTest
    public void setup() {

        //handle browser level show notification pop window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com";
        //validating or verifying Title and URL
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Current url: " + driver.getCurrentUrl());
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.yatra.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

