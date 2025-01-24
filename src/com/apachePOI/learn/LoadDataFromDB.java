package com.apachePOI.learn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadDataFromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/education"; //DB details
		String userName = "root"; //User Name
		String userPassword = "tccs"; //User Password
		String query = "Select * from user_dlt";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName, userPassword);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from people");
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("DataFromDB");
		
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("Name");
		
		cell = row.createCell(2);
		cell.setCellValue("Age");
		
		int rowID =2;
		
		while(rs.next()) {
			
			row = sheet.createRow(rowID);
			cell = row.createCell(1);
			cell.setCellValue(rs.getString("name"));
			
			row = sheet.createRow(rowID);
			cell = row.createCell(2);
			cell.setCellValue(rs.getInt("age"));
			rowID++;
		}
		
		FileOutputStream out = new FileOutputStream(
				new File("Load_FromDB.xlsx"));
		book.write(out);
		System.out.println("Data created");
	}

}
