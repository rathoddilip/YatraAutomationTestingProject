package com.selenium.yatra.base;

import com.selenium.yatra.utility.LogClass;
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

        LogClass.info("******************************* Starting test cases ****************************************");
        //handle browser level show notification pop window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        LogClass.info("launching the Chrome browser");
        driver = new ChromeDriver(options);
        LogClass.info("Navigate to url yatra ");
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

        LogClass.info("******************************* End Test Cases ****************************************");
        driver.quit();
    }
}

