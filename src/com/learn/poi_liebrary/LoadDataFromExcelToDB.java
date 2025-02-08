package com.learn.poi_liebrary;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadDataFromExcelToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bookName = "E:\\Database\\customer.xlsx"; //Workbook name
		String URL ="jdbc:mysql://localhost:3306/education"; // DB connect URL
		String userName = "root"; //DB UserName
		String userPassword = "tccs";//DB UserPassword
		
		try(FileInputStream fis = new FileInputStream(bookName);
				XSSFWorkbook workbook = new XSSFWorkbook(fis))
		{
			// Get the first sheet from the Excel file
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
			Connection con = DriverManager.getConnection(URL, userName, userPassword);
			
			 // Prepare the SQL statement for inserting data
			String queary = "INSERT INTO employee (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUE(?,?,?,?,?,?,?)";
			PreparedStatement pt = con.prepareStatement(queary);
			
			//Iterate through the rows of the Excel file
			for(Row row : sheet) {
				
				// Skip the header row (assume the first row is the header)
                if (row.getRowNum() == 0) {
                    continue;
                }
                
             // Get the cell values (assuming name is in column 0 and age is in column 1)
               String CustomerName = row.getCell(2).getStringCellValue();
               String ContactName = row.getCell(3).getStringCellValue();
               String Address = row.getCell(4).getStringCellValue();
               String City = row.getCell(5).getStringCellValue();
               String PostalCode = row.getCell(6).getStringCellValue();
               String Country = row.getCell(7).getStringCellValue();
               
               // Set the values in the PreparedStatement
               pt.setString(2, CustomerName);
               pt.setString(3, ContactName);
               pt.setString(4, Address);
               pt.setString(5, City);
               pt.setString(6, PostalCode);
               pt.setString(7, Country);
               
               // Execute the SQL statement
               pt.executeUpdate();
			}
			
			// Close resources
            pt.close();
            con.close();
            System.out.println("Data has been successfully uploaded to the database!");

			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
