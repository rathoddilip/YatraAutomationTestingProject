package com.selenium.yatra.utility;

import com.github.miachm.sods.Sheet;
import com.github.miachm.sods.SpreadSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {

    public void readDataFromODS() throws IOException {

        File sourceFile = new File("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCredentials.ods");
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        SpreadSheet spreadSheet = new SpreadSheet(fileInputStream);
        Sheet sheet=spreadSheet.getSheet(0);
        System.out.println(sheet);
        System.out.println("SheetName: "+sheet.getName());
        System.out.println("number of sheet: " + spreadSheet.getNumSheets() + spreadSheet.getSheet(0));
        System.out.println("SpreadSheet:"+spreadSheet);
    }
    public  void readDataWorkbook() throws IOException {

        File sourceFile= new File("/home/arjun/Dilip/YatraApplicationAutomationProject/src/main/resources/YatraLoginCredentials.ods");
        FileInputStream fileInputStream= new FileInputStream(sourceFile);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
        System.out.println("Sheet:"+sheet);

    }
}


