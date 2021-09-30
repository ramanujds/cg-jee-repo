package com.cg.jdbcapp.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	static String user, password, url;
	
	static Connection con;
	
	public static void readConnectionProperties() throws IOException {
		FileReader reader=new FileReader("db.properties");
		
		Properties dbProperties=new Properties();
		dbProperties.load(reader);
		url=dbProperties.getProperty("url");
		user=dbProperties.getProperty("user");
		password=dbProperties.getProperty("password");
		
	}
	
	public static Connection getConnection() throws SQLException, IOException {
		readConnectionProperties();
		 con=DriverManager.getConnection(url,user,password);
		 return con;
	}
	
}
