package com.bd.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.sun.corba.se.pept.transport.Connection;

public class MySQLConnUtils {
	
	 public static Connection getMySQLConnection()
	         throws ClassNotFoundException, SQLException {
	     // Note: Change the connection parameters accordingly.
	     String hostName = "localhost";
	     String dbName = "bd_db";
	     String userName = "root";
	     String password = "Inno$123";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	  
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	    
	     Class.forName("com.mysql.jdbc.Driver");
	  
	     // URL Connection for MySQL:
	     // Example: 
	     // jdbc:mysql://localhost:3306/simplehr
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	  
	     Connection conn =  DriverManager.getConnection(connectionURL, userName, password);
	     return conn;
	 }

}
