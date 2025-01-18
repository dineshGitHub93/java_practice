package com.oops_framework.learning;

abstract class DatabaseConnector {
	
	public abstract void connect();
	
	public void disconnect() {
		System.out.println("disconnected from the Database");
	}
}

class MySQLConnector extends DatabaseConnector {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to MySQL Database");
	}
	
}
class PostgreConnector extends DatabaseConnector {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to Postgre Database");
	}
	
}
public class AbstractInFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySQLConnector mySQL = new MySQLConnector();
		mySQL.connect();
		mySQL.disconnect();
		
		PostgreConnector pSQL = new PostgreConnector();
		pSQL.connect();
		pSQL.disconnect();
	}

}
