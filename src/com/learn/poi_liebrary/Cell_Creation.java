package com.learn.poi_liebrary;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cell_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a new workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create a blank spread sheet
		XSSFSheet spreadsheet = workbook.createSheet("New Sheet");
		
		//Create a first row on a create speard
		XSSFRow row = spreadsheet.createRow(0);
		
		//Create a first cell on created row
		XSSFCell cell = row.createCell(0);
	}

}
