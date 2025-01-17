package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TypeOfPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Load the driver using forName() method
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("What age category do you want search : ");
			
			int age = sc.nextInt();
			
			//establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "tccs");
			
			//create a prepared statement
			PreparedStatement ps = con.prepareStatement(
					"Select name from education.people where age = ?");
			
			//Executing the query
			ps.setInt(1, age);
			ResultSet rs = ps.executeQuery();
			
			//condition checking using next() method
			//to check for element
			while(rs.next()) {
				System.out.println("Name : "+rs.getString("name"));
			}
		}
		catch (SQLException e) {
			// Display the DB exception if any
            System.out.println(e);
		}
		catch (ClassNotFoundException e2) {
			System.out.println("Unable to found class : "+e2.getMessage());
		}

	}

}
