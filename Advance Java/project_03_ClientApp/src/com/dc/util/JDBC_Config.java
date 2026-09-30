package com.dc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Config {
	public static Connection con() throws SQLException {
		String url="jdbc:mysql://localhost:3306/DC_ADV_21_SEP";
		String userName="root";
		String password="Tarunrb@123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(url,userName,password);
		
	}

}
