package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadSheetCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create a blank work book
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet("Employee_Info");
		
		//Create row object
		XSSFRow row;
		
		//This data needs to be written (Object[])
		Map<String, Object[]> empinfo = new TreeMap<String, Object[]>();
		
		empinfo.put("1", new Object[] {"EMP ID", "EMP NAME", "DESIGNATION"});
		empinfo.put("2", new Object[] {"tp001", "Aadvick", "Developer"});
		empinfo.put("3", new Object[] {"tp002", "Birav", "Automation Tester"});
		empinfo.put("4", new Object[] {"tp003", "Rithvick", "Tester"});
		empinfo.put("5", new Object[] {"tp004", "Krish", "IT Dept"});
		empinfo.put("6", new Object[] {"tp005", "Jenita", "Human Resource"});
		empinfo.put("7", new Object[] {"tp006", "Ankita", "HR.Manager"});
		
		//Iterate over data and write to sheet
		Set<String> keyid = empinfo.keySet();
		int rowid = 0;
		
		//Iterate through the data
		for(String key : keyid) {
			
			row = spreadsheet.createRow(rowid++);
			Object [] objArr = empinfo.get(key);
			int cellid = 0;
			
			for(Object obj : objArr) {
				
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
		}
		
		 //Write the workbook in file system
		FileOutputStream fos = new FileOutputStream(new File("EmployeeData.xlsx"));
		workbook.write(fos);
		
		//close object
		fos.close();
		
		System.out.println("Employee Sheet has been written successfully ");
		
	}

}
