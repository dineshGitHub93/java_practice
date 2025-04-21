package com.selenium.learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@DataProvider(name = "excelData")
	public Object[][] getData() throws IOException {
		
		try{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"./resources/TestData.xlsx");
	         XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
		    int rows = sheet.getPhysicalNumberOfRows();
		    int cols = sheet.getRow(0).getLastCellNum();

		    Object[][] data = new Object[rows-1][cols];
		    
		    
		    for (int i = 1; i <= rows; i++) {
		    	Row row = sheet.getRow(i);
	            if (row == null) {
	                Arrays.fill(data[i - 1], null);
	                continue;
	            }
	            
	            for (int j = 0; j < cols; j++) {
	                Cell cell = row.getCell(j, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
	                if (cell != null) {
	                    switch (cell.getCellType()) {
	                        case STRING -> data[i - 1][j] = cell.getStringCellValue();
	                        case NUMERIC -> data[i - 1][j] = cell.getNumericCellValue();
	                        case BOOLEAN -> data[i - 1][j] = cell.getBooleanCellValue();
	                        default -> data[i - 1][j] = null;
	                    }
	                } else {
	                    data[i - 1][j] = null;
	                }
		    }
		    }
		    wb.close();
		    return data;
		    
		}catch (Exception e) {
			e.getMessage();
			return null;
		}
	    
	}
	
	@Test(dataProvider = "excelData")
	public void testWithExcelData(String username, String password, boolean isAdmin) { 
	    // Example: Login test with different user roles
	    System.out.println("Username: " + username);
	    System.out.println("Is Admin? " + isAdmin);
	}

}
