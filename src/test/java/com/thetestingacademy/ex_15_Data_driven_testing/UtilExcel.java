package com.thetestingacademy.ex_15_Data_driven_testing;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    /* Apache POI
    1. Read the file
    2. Create Workbook
    3. pass data as 2D object to getData()
     */

    static Workbook book;
    static Sheet sheet;

    public static String sheet_path = System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";

    public static Object[][] getTestDataFromExcel(String sheetName)
    {
        FileInputStream file = null;
        try {
             file = new FileInputStream(sheet_path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i = 0; i<sheet.getLastRowNum(); i++)
        {
            for(int j = 0; j<sheet.getRow(0).getLastCellNum(); j++)
            {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return data;
    }

    @DataProvider
    public Object[][] getData()
    {
        return getTestDataFromExcel("Sheet1");
    }
}
