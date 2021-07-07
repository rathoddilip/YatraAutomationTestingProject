package com.selenium.yatra.utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFCell cell;
    public FileOutputStream fileOutputStream;
    String excelPath;
    File file;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {

        this.excelPath = excelPath;
        FileInputStream fileInputStream = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet(sheetName);
        fileInputStream.close();
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

    private void setCellData(String testStatus, int rowNumber) {
        try {
            XSSFRow currentRow = sheet.getRow(rowNumber);
//            currentRow.createCell(0).setCellValue(testCaseName);//set data into a cell
            currentRow.createCell(2).setCellValue(testStatus);//set status into a cell
            cell = currentRow.getCell(2); //getting cell of status
            file = new File(excelPath);
            if (!file.exists()) {
                throw new CustomException(CustomException.ExceptionType.FILE_NOT_EXIST, "File not exist please check file path and name");
            }

            //writing data to file by using FileOutputStream
            fileOutputStream = new FileOutputStream(file);
            //Data written to sheet
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (IOException | CustomException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
