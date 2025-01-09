package com.apachePOI.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBookSample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream file = new FileInputStream(new File("example.xlsx"));
			Workbook wb = WorkbookFactory.create(file);
			
			//Get the sheet
			Sheet sheet = wb.getSheetAt(0);
			
			//Iterate through rows and cells 
			for(Row row : sheet) {
				for(Cell cell : row) {
					
					switch (cell.getCellStyle()) {
					
					case STRING: 
						System.out.println(cell.getStringCellValue()+ "\t");
						break;
					case NUMERIC:
						  System.out.print(cell.getNumericCellValue() + "\t");
                          break;
                      case BOOLEAN:
                          System.out.print(cell.getBooleanCellValue() + "\t");
                          break;
                      default:
                          System.out.print("Unknown Cell Type\t");
		
					}
				}
				System.out.println();
			}
			
			wb.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
