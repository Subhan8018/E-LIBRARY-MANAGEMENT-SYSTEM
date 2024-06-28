package com.java.dao;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class DB {
public static Connection getCon() throws SQLException, ClassNotFoundException {
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "lms"; 
        String dbUsername = "root"; 
        String dbPassword = "Subhan@123"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
		return con;
	
}
}
