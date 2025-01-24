package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create a spread sheet
		XSSFSheet sheet = workbook.createSheet("Bio_Graph");
		
		Map<String, Object[]> biodata = new TreeMap<String, Object[]>();
		biodata.put("1", new Object[] {"ID", "NAME"});
		biodata.put("2", new Object[] {"B001", "Blue"});
		biodata.put("3", new Object[] {"B002", "Yellow"});
		biodata.put("4", new Object[] {"B003", "Green"});
		biodata.put("5", new Object[] {"B004", "Pink"});
		biodata.put("6", new Object[] {"ID", "NAME"});
		biodata.put("7", new Object[] {"ID", "NAME"});
		
		Set<String> keyset = biodata.keySet();
		int rowID = 0;
		
		for(String key : keyset) {
			
			XSSFRow row = sheet.createRow(rowID++);
			Object[] obj = biodata.get(key);
			int cellID = 0;
			
			for(Object objArr :obj) {
				
				XSSFCell cell = row.createCell(cellID++);
				cell.setCellValue((String)objArr);
			}
			System.out.println();
			
		}
		FileOutputStream out = new FileOutputStream(
								new File("Demo.xlsx"));
		workbook.write(out);
		System.out.println("File created successfully...!");
	}

}
