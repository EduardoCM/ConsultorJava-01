package com.spacemoney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class BDConnection {
	
	String host = "localhost";
	
	String dataBase = "SpaceMoney";
	
	String user = "SA";
	
	String password = "Usr13Space21";
	
	static {
		new SQLServerDriver();
	}
	

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlserver://" + host + ";databaseName="+dataBase, user, password);
	}

}
