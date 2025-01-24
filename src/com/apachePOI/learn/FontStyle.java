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

public class FontStyle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Create Font styles");
		XSSFRow row = sheet.createRow(2);
		
		//Create a new Font and alter it
		XSSFFont font = book.createFont();
		font.setFontHeightInPoints((short)30);
		font.setFontName("Goudy Stout");
		font.setItalic(true);
		font.setColor(IndexedColors.BLUE_GREY.index);
		
		//Set font into style
		XSSFCellStyle style = book.createCellStyle();
		style.setFont(font);
		
		//Create cell and apply style
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("Font style");
		cell.setCellStyle(style);
		
		FileOutputStream out = new FileOutputStream(
				new File("fontstyle.xlsx"));
		
		book.write(out);
		System.out.println("Book created and font updated");

	}

}
