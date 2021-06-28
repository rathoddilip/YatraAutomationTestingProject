package com.selenium.yatra.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current url: " + driver.getCurrentUrl());
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
