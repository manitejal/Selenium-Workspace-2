package com.sql.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeTest;

public class DatabaseConnections {


	private static final String URL = "jdbc:mysql://qatestdb.c2mtl3rwwy8n.us-east-1.rds.amazonaws.com:3306/admin";
	private static final String USER = "admin";
	private static final String PASS = "DBAdmin#06122021";
	
	
	@BeforeTest
	public void beforeTest() {
		try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = conn.createStatement()) {
			
			
			statement.executeQuery("LOAD DATA LOCAL INFILE 'C:/Users/Vignesh/Downloads/issue.csv' INTO TABLE secpod_table FIELDS TERMINATED BY ',' ENCLOSED BY '\"' LINES TERMINATED BY '\\n' IGNORE 1 ROWS");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
