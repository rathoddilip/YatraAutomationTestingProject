package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderClass extends BaseClass {

    public static DataConfig dataConfig = new DataConfig();
    public static String excelPath = DataConfig.filePath;

    // @DataProvider passes data to test
    @DataProvider(name = "testDataSet")
    public Object[][] getData() {
        // Create object with two paraments
        // first parameter is row and second one is column
        return new Object[][]{{email, password}};
    }
    // @DataProvider passes data to test
    @DataProvider(name = "testDataSetFromFile")
    public Object[][] getDataFromFile() throws IOException {

        dataConfig.setExcelFile(excelPath);
        String username;
        String password;
        Object[][] eXcelData = new Object[1][2];
        //iterate over all the row to print the data present in each cell
        for (int i = 1; i <= 1; i++) {

            username = dataConfig.getCellData(i, 0);
            password = dataConfig.getCellData(i, 1);
            // Create object with two paraments
            // first parameter is row and second one is column
            eXcelData = new Object[][]{{username, password}};
        }
        return eXcelData;
    }
}
