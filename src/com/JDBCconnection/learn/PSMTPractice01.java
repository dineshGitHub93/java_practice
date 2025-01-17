package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PSMTPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/education";
		String userName = "root";
		String userPWD = "tccs";
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			Connection con = DriverManager.getConnection(url, userName, userPWD);
			System.out.println("Connected to the database!");
			 
			//Create statement
			PreparedStatement ps = con.prepareStatement("INSERT INTO education.people (name,age) VALUES (?,?)" );
			ps.setString(1, "Kunja");
			ps.setInt(2, 1);
			
			ps.executeUpdate();
			
			
		}
		catch (Exception e) {
			System.out.println("Exception Occurred : "+e.getMessage());
		}

	}

}
