package com.selenium.yatra.utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.sql.rowset.serial.SerialStruct;
import java.io.FileInputStream;
import java.io.IOException;

public class DataConfig {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static String filePath = "/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCredentials.xlsx";
    //public static String sheetName="";
    public void setExcelFile(String filePath) throws IOException {

        //Create an object of FileInputStream class to read excel file
        FileInputStream fileInputStream = new FileInputStream(filePath);
        System.out.println("files: " + fileInputStream);
        //creating workbook instance that refers to .xlsx file
        workbook = new XSSFWorkbook(fileInputStream);
        String sheetName = workbook.getSheetName(0);
        System.out.println("Sheet Name: " + sheetName);
        //creating a Sheet object
        sheet = workbook.getSheetAt(0);
        System.out.println("FirstRow: "+sheet.getFirstRowNum()+"LastRow: "+sheet.getLastRowNum());

    }
    public String getCellData(int rowNumber, int cellNumber) {
        //getting the cell value from rowNumber and cell Number
        cell = sheet.getRow(rowNumber).getCell(cellNumber);
        System.out.println("Cell Data: "+cell);
        String value=cell.getStringCellValue();
        return value;

        //returning the cell value as string
        //return cell.getStringCellValue();
    }

    public int getRowCountInSheet() {
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        System.out.println("RowCount:"+rowCount);
        return rowCount;
    }
}
