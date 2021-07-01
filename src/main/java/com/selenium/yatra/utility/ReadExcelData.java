package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData extends BaseClass {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    static DataConfig dataConfig= new DataConfig();
    static String excelPath=DataConfig.filePath;


    public String getUserNameData() throws IOException {
        dataConfig.setExcelFile(excelPath);
        String username = "";
        //iterate over all the row to print the data present in each cell.
        for (int i = 1; i <=dataConfig.getRowCountInSheet(); i++) {
            System.out.println("getRowCount: "+dataConfig.getRowCountInSheet());
            email = dataConfig.getCellData(i, 0);
            password=dataConfig.getCellData(i,1);

        }
        System.out.println("Username:" + email);
        return username;
    }
}


