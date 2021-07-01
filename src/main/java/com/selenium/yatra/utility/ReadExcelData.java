package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;

import java.io.IOException;

public class ReadExcelData extends BaseClass {

    static DataConfig dataConfig = new DataConfig();
    static String excelPath = DataConfig.filePath;


    public String getUserNameData() throws IOException {
        dataConfig.setExcelFile(excelPath);
        String username = "";
        //iterate over all the row to print the data present in each cell.
        for (int i = 1; i <= dataConfig.getRowCountInSheet(); i++) {
            System.out.println("getRowCount: " + dataConfig.getRowCountInSheet());
            email = dataConfig.getCellData(i, 0);
            password = dataConfig.getCellData(i, 1);

        }
        System.out.println("Username:" + email);
        return username;
    }
}


