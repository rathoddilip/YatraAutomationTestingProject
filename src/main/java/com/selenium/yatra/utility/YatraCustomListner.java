package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.IOException;

public class YatraCustomListner extends BaseClass implements ITestListener {

    ScreenshotTestImage screenshotTestImage = new ScreenshotTestImage();

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");
        try {
            screenshotTestImage.failed(result.getMethod().getMethodName());
//            WriteTestStatusToExcel.writeStatus(1,2,"FAIL");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS Test");

        screenshotTestImage.success(result.getMethod().getMethodName());
//            WriteTestStatusToExcel.writeStatus(1,2,"PASS");
    }
}
