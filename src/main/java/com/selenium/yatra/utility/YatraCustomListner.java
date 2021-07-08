package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class YatraCustomListner extends BaseClass implements ITestListener {

    ScreenshotTestImage screenshotTestImage = new ScreenshotTestImage();
    public static int rowDynamic = 1;

    public YatraCustomListner() {
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");
        try {
            screenshotTestImage.failed(result.getMethod().getMethodName());
            WriteTestStatusToExcel.writeStatus(rowDynamic, 2, "FAIL");
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error fail: " + "_" + 2 + "_" + "fail");
        }
        rowDynamic++;
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS Test");

        screenshotTestImage.success(result.getMethod().getMethodName());
        try {
            WriteTestStatusToExcel.writeStatus(rowDynamic, 2, "PASS");
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error pass: " + "_" + 2 + "_" + "pass");
        }
        rowDynamic++;
    }
}
