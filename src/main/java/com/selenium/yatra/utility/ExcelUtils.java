package com.selenium.yatra.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    public static XSSFWorkbook workbok;
    public static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbok = new XSSFWorkbook(excelPath);
        sheet = workbok.getSheet(sheetName);
    }

    public int getColCount() {
        int colCount = 0;
        try {
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("number of column: " + colCount);

        } catch (Exception exception) {
            exception.getStackTrace();
        }
        return colCount;
    }

    public int getRowCount() {
        int rowCount = 0;
        try {
            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("number of rows: " + rowCount);

        } catch (Exception exception) {
            exception.getStackTrace();
        }
        return rowCount;
    }

    public String getCellDataString(int rowNumber, int colNumber) {
        String cellData = null;
        try {
            cellData = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();

        } catch (Exception exception) {
            exception.getStackTrace();
        }
        return cellData;
    }
}
