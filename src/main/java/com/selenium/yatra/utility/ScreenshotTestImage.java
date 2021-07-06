package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScreenshotTestImage extends BaseClass {

    public File sourceFile;
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

    public void failed(String testMethodName) throws IOException {

        sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(sourceFile, new File("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/java/com/selenium/yatra/testfailed/FAILED" + "_" + testMethodName + timeStamp + ".jpg"));

        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    public void success(String testMethodName) {
        sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(sourceFile, new File("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/java/com/selenium/yatra/testsuccess/SUCCESS" + "_" + testMethodName + timeStamp + ".jpg"));

        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }
}
