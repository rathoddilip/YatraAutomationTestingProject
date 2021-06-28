package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;
    public String email = "abc@gmail.com";
    public String password = "abc@123";
    public String mobileNumber = "7923995045";

    @BeforeTest
    public void setup() {
        //handle browser level show notification pop window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current url: " + driver.getCurrentUrl());
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
