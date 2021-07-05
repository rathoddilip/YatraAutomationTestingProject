package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBrowserClass {

    public static WebDriver crossDriver;

    @BeforeTest
    @Parameters("browserName")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("FireFox")) {

            WebDriverManager.firefoxdriver().setup();
            crossDriver = new FirefoxDriver();
            crossDriver.get("https://www.yatra.com/");
            crossDriver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("Chrome")) {

            //handle browser level show notification pop window
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            crossDriver = new ChromeDriver(options);
            crossDriver.get("https://www.yatra.com/");
            crossDriver.manage().window().maximize();
        } else {

            System.out.println("Incorrect browser value passed");
        }
    }

    @AfterTest
    public void closeBrowser() {
        crossDriver.quit();
    }
}
