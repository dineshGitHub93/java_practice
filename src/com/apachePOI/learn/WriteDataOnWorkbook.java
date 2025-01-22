package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.result.Row;

public class WriteDataOnWorkbook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create work book
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create Spreadsheet
		XSSFSheet spreadSheet = workbook.createSheet("Student_Data");
		
		//Data to be written in the excel
		Map<String, Object[]> stu_info = new TreeMap<String, Object[]>();
		stu_info.put("1", new Object[] {"ID","Name", "Age"});
		stu_info.put("2", new Object[] {"V01","Hathvick", "10"});
		stu_info.put("3", new Object[] {"V02","Amar", "10"});
		stu_info.put("4", new Object[] {"V03","Anurac", "10"});
		stu_info.put("5", new Object[] {"V04","Hem", "10"});
		stu_info.put("6", new Object[] {"V05","Rushank", "10"});
		
		
		Set<String> stuKey = stu_info.keySet();
		int rowID = 0;
		
		for(String key : stuKey) {
			
			XSSFRow row = spreadSheet.createRow(rowID++);
			Object[] objArr = stu_info.get(key);
			int cellID = 0;
			
			for(Object obj : objArr) {
				
				XSSFCell cell = row.createCell(cellID++);
				cell.setCellValue((String)obj);
			}
		}
		
		FileOutputStream output = new FileOutputStream(new File("Student_info.xlsx"));

		workbook.write(output);
		output.close();
		
		System.out.println("Workbook create and Data written successfully..!");
	}

}
