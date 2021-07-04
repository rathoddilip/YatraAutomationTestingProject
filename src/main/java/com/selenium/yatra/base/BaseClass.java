package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;
    public static String email = "diliprathod32@gmail.com";
    public static String password = "Login@123";
    public static String mobileNumber = "7756994045";


    @BeforeTest
    public void setUp() {

        //handle browser level show notification pop window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
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

