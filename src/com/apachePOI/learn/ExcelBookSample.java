package com.apachePOI.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBookSample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		try {
			//Create a object for WorkBook Interface
			XSSFWorkbook workbook = new XSSFWorkbook();
			
			//Create a blank spread sheet by creating an object of 
			//XSSF Sheet and also given name 
			XSSFSheet sheet = workbook.createSheet("sample");
			
			String location = "E:\\java_practice-1\\sample.xlsx";
			
			// place the output file in location
			FileOutputStream outputFile = new FileOutputStream(location);
						
			//Write workbook
			workbook.write(outputFile);
			
			 System.out.println("Workbook written successfully to " + location);
			 
			 workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
