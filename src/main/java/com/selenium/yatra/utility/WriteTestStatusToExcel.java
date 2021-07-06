package com.selenium.yatra.utility;

import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTestStatusToExcel {

    public static XSSFWorkbook workbok;
    public static XSSFSheet sheet;
    public static XSSFRow row;


    public static void  writeStatus (int rowPosition, int colPosition, String pass) throws IOException {

        System.out.println(rowPosition+":"+colPosition+":"+pass);
        // Write the data back in the Excel file
        workbok = new XSSFWorkbook(new FileInputStream(new File("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/LoginCredentials.xlsx")));
        sheet=workbok.getSheet("Sheet1");
        row=sheet.getRow(rowPosition);
        row.createCell(colPosition).setCellValue(pass);
        FileOutputStream fileOutputStream=new FileOutputStream("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/LoginCredentials.xlsx");
        workbok.write(fileOutputStream);
    }


}
