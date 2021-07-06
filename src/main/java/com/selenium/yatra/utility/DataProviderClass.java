package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;

public class DataProviderClass extends BaseClass {

    // @DataProvider passes data to test
    @DataProvider(name = "testDataSet")
    public Object[][] getData() {

        // first parameter is row and second one is column
        return new Object[][]{{email, password}};
    }

    @DataProvider(name = "testDataSetFromExcelFile")
    public Object[][] getDataTest() throws IOException {
        String excelPath = "/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCreadentials.xlsx";
        File file = new File(excelPath);
        try {
            if (!file.exists()) {

                throw new CustomException(CustomException.ExceptionType.FILE_NOT_EXIST, "File not Exist Please check file path and file name");
            }
        } catch (CustomException exception) {

            System.out.println(exception.getMessage());
        }
        Object[][] data = ExcelDataProvider.testData(excelPath, "loginCredentials");
        return data;
    }
}
