package com.apachePOI.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenWorkBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Workbook workbook;
			
			// Path to the Excel file
			File file = new File("OpenWorkBook.xlsx");
			
			// Open the file as an InputStream
			FileInputStream fis = new FileInputStream(file);
			
			// Load the workbook
			 workbook = new XSSFWorkbook(fis);
			
			// Perform operations on the workbook (e.g., read sheets, rows, cells)
			System.out.println("This Workbook has "+workbook.getNumberOfSheets()+" sheets");
			
			if(file.isFile() && file.exists()) {
				System.out.println(file.getName() +" Opened successfully ");
			}
			else {
				System.out.println("Error to open "+file.getName()+" file.");
			}
			
		}
		catch (Exception e) {
			System.out.println("Execption occured : "+ e.getMessage());
		}

	}

}
