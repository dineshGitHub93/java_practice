package com.apachePOI.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadInputFromExcel {
	static XSSFRow row;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create Object File input stream to read data from Excel
		FileInputStream fis = new FileInputStream(
				new File("EmployeeData.xlsx"));
		//Load Workbook to open
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Specify spreadsheet which need to read
		XSSFSheet spreadsheet = workbook.getSheet("Employee_Info");
		
		Iterator<Row> rowInterator = spreadsheet.iterator();
		
		while(rowInterator.hasNext()) {
			
			Row row = rowInterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				switch(cell.getCellType()) {
				
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t\t");
				}
				
			}
			System.out.println();
		}
		fis.close();

	}

}
