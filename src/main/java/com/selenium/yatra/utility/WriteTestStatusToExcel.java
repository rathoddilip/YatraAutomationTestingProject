package com.selenium.yatra.utility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTestStatusToExcel {

    public static XSSFWorkbook workbok;
    public static XSSFSheet sheet;
    public static XSSFRow row;

    public static void writeStatus(int rowPosition, int colPosition, String pass) throws IOException {

        String fileName="/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCreadentials.xlsx";

        workbok = new XSSFWorkbook(new FileInputStream(fileName));
        sheet = workbok.getSheet("loginCredentials");
        row = sheet.getRow(rowPosition);
        row.createCell(colPosition).setCellValue(pass);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        workbok.write(fileOutputStream);
    }
}



