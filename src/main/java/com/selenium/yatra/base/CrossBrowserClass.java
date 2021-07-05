package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBrowserClass {
    public static WebDriver driver;


    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("FireFox")) {

            WebDriverManager.firefoxdriver().setup();
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://www.yatra.com/");
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("Chrome")) {

            //handle browser level show notification pop window
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.get("https://www.yatra.com/");
            driver.manage().window().maximize();
        } else {

            System.out.println("Incorrect browser value passed");
        }
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
