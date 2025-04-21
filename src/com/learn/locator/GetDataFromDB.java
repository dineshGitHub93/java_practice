package com.learn.locator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class GetDataFromDB {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/education";
		String userName = "root";
		String password = "tccs";
		List<Employee> employees = new  ArrayList<Employee>();
		
		try{
			// 1. Load the MySQL JDBC driver (optional for newer versions)
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
			Connection con = DriverManager.getConnection(url, userName, password);
			
			PreparedStatement pst = con.prepareStatement("Select * from people");
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee(
						rs.getString("name"),
						rs.getInt("age")
						);
				employees.add(emp);
			}
		}catch (Exception e) {
			e.getMessage();
		}
		System.out.println(employees);	
	}

}
