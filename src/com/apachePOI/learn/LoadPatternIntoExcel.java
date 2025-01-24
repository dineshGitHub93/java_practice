package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadPatternIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Load_Pattern");
		int rowID = 2;
		
		for(int i=1; i<=5;i++) {
			XSSFRow row = sheet.createRow(rowID++);
			
			for(int j=1;j<=i;j++) {
			
				XSSFCellStyle style = book.createCellStyle();
				style.setFillBackgroundColor(IndexedColors.BLUE_GREY.index);
				
				XSSFCell cell = row.createCell(j);
				cell.setCellValue("*");
				cell.setCellStyle(style);
			}
			System.out.println();
		}
		FileOutputStream out = new FileOutputStream(
				new File("Pattern.xlsx"));
		
		book.write(out);
		System.out.println("Book create and pattern loaded");
	}

}
