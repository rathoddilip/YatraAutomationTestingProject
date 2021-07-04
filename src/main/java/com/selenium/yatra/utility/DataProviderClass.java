package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderClass extends BaseClass {

    // @DataProvider passes data to test
    @DataProvider(name = "testDataSet")
    public Object[][] getData() {
        // Create object with two parameters
        // first parameter is row and second one is column
        return new Object[][]{{email, password}};
    }

    @DataProvider(name = "testDataSetFromExcelFile")
    public Object[][] getDataTest() throws IOException {
        String excelPath = "/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCreadentials.xlsx";
        Object[][] data = ExcelDataProvider.testData(excelPath, "loginCredentials");
        return data;
    }


}
