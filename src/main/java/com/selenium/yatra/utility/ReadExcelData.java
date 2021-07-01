package com.selenium.yatra.utility;

import java.io.IOException;

public class ReadExcelData {

    public static DataConfig dataConfig = new DataConfig();
    public static String excelPath = DataConfig.filePath;

    public String getPasswordData() throws IOException {

        dataConfig.setExcelFile(excelPath);
        String password = "";
        //iterate over all the row to print the data present in each cell.
        for (int i = 1; i <= 1; i++) {
            password = dataConfig.getCellData(i, 1);
        }
        return password;
    }

    public String getUserNameData() throws IOException {

        dataConfig.setExcelFile(excelPath);
        String emailIdData = "";
        //Object[][] data = new Object[1][1];
        //iterate over all the row to print the data present in each cell
        for (int i = 1; i <= 1; i++) {
            emailIdData = dataConfig.getCellData(i, 0);
        }
        return emailIdData;
    }
}


