package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TypesofCells {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a new workbook
		XSSFWorkbook book = new XSSFWorkbook();
		//Create a spread sheet
		XSSFSheet sheet = book.createSheet("Types of cell");
		
		XSSFRow row = sheet.createRow((short)2);
		row.createCell(0).setCellValue("Types of Cell");
		row.createCell(1).setCellValue("Cell Values");

		row = sheet.createRow((short)3);
		row.createCell(0).setCellValue("set cell type BLANK");
		row.createCell(1);
		
		row = sheet.createRow((short)4);
		row.createCell(0).setCellValue("set cell type Boolean");
		row.createCell(1).setCellValue(true);
		
		row = sheet.createRow((short)5);
		row.createCell(0).setCellValue("set cell type Date");
		row.createCell(1).setCellValue(new Date());
		
		row = sheet.createRow((short)5);
		row.createCell(0).setCellValue("set cell type string");
		row.createCell(1).setCellValue("A String");
		
		FileOutputStream out = new FileOutputStream(
				new File("WriteCellTypes.xlsx"));
		book.write(out);
		
		System.out.println("Book create and written successfully ");
	}

}
