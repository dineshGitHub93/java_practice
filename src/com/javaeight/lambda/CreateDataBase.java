package com.javaeight.lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.JDBCconnection.learn.CoonectSQLForInsert;

public class CreateDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "tccs");
			
			Statement st = con.createStatement();
			
			st.execute("CREATE DATABASE mysqldb");
			 System.out.println("Database created successfully...!");
						
		}catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception : "+e.getMessage());
		}
		catch (SQLException e) {
			System.out.println("SQL Exception Execption : "+e.getMessage());
		}

	}

}
