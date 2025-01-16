package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleToDB {
	
	public static void addDataIntoDB(String name , int ID) {
		
		// Database URL, username, and password
				// Replace with your database name

				String url = "jdbc:mysql://localhost:3306/education";

				// Replace with your MySQL username
				String userName = "root";

				// Replace with your MySQL password
				String userPassword = "tccs";

				// Updated query syntax for modern databases
				String query = "INSERT INTO user_dlt (id, name) VALUES ('"+ID+"','"+name+"')";

				//JDBC Connection
				try {
					// Load Type-4 Driver
					// MySQL Type-4 driver class
					Class.forName("com.mysql.cj.jdbc.Driver");

					// Establish connection
					Connection c = DriverManager.getConnection(
							url, userName, userPassword);

					// Create a statement
					Statement st = c.createStatement();

					// Execute the query
					int count = st.executeUpdate(query);
					System.out.println("Number of rows affected by this query : "+count);

					// Close the connection
					st.close();
					c.close();
					System.out.println("Connection closed.");
				}
				catch (ClassNotFoundException e) {
					System.err.println("JDBC Driver not found: "
							+ e.getMessage());
				}
				catch (SQLException e) {
					System.err.println("SQL Error: "
							+ e.getMessage());
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean	IsExsit = true;
		int ID = 110;
		
		while(IsExsit) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Execute DB comments");
		String mode = sc.nextLine();
		
		switch (mode){
		case "run":
			
			System.out.println("Please value for name column");
			String name = sc.next();
			addDataIntoDB(name, ID);
			ID +=1;
			IsExsit = true;
			break;
		case "stop":
			System.out.println("Loop has been terminated");
			IsExsit = false;
			break;
		}
	
		
		
			
		}

	}

}
