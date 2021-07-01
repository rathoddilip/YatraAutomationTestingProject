package com.selenium.yatra.utility;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ReadExcelData {

    public static DataConfig dataConfig = new DataConfig();
    public static String excelPath = DataConfig.filePath;

    public String getUserNameData() throws IOException {
         //get the excel file
        dataConfig.setExcelFile(excelPath);
        String Username = "";
        //iterate over all the row to print the data present in each cell
        for (int i = 1; i <= 1; i++) {
            Username = dataConfig.getCellData(i, 0);
        }
        return Username;
    }
    public String getPasswordData() throws IOException {

        dataConfig.setExcelFile(excelPath);
        String password = "";

        for (int i = 1; i <= 1; i++) {
            password = dataConfig.getCellData(i, 1);
        }
        return password;
    }
}


