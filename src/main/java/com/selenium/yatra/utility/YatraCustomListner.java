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

    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS Test");

        try {
            screenshotTestImage.success(result.getMethod().getMethodName());
            WriteTestStatusToExcel.writeStatus(rowDynamic, 2, "PASS");
            LogClass.info(result.getMethod().getMethodName() + " :take success screenshot in ITestlistner method");

        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error pass: " + "_" + 2 + "_" + "pass");
        }
        rowDynamic++;
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");

        try {
            screenshotTestImage.failed(result.getMethod().getMethodName());
            WriteTestStatusToExcel.writeStatus(rowDynamic, 2, "FAIL");
            LogClass.error(result.getMethod().getMethodName() + " :take failed screenshot in Ilistner method");
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error fail: " + "_" + 2 + "_" + "fail");
        }
        rowDynamic++;
    }
}
