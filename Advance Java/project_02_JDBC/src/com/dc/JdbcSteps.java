package com.dc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSteps {
	public static void main(String[] args) {
		System.out.println("welcome to JDBC");
		
		//java.sql.Driver(I) ->Specification
		//com.mysql.cj.jdbc.Driver(C) -> Implementation
		
		
		try {
//			1. load & register Driver.class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded and Registered Scucessfuly");
			
//			2. Establish Connection between Java source and MySql
			String url="jdbc:mysql://localhost:3306/DC_ADV_21_SEP";
			String userName="root";
			String password="Tarunrb@123";
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DC_ADV_21_SEP","root","Tarunrb@123");
			
			Connection con = DriverManager.getConnection(url,userName,password);
			System.out.println("Scucessfuly established Connection");
//			System.out.println(con);
			
//			3. Create Statement/platform
			Statement st = con.createStatement();
			System.out.println("STEP 3: IS DONE");
			
//			4. EXCECUTE QUERY
//			String sql="CREATE TABLE STUDENT ( STD_ID INT, SNAME VARCHAR(30), CLASS INT)";
//			boolean res = st.execute(sql);
			
			String sql="INSERT INTO CLIENT VALUES (3, 'BOSCH', 'KUNAL' , 'KUNAL@GMAIL.COM', 3636363636)";
			
			int res = st.executeUpdate(sql);
			System.out.println(res>0?"STEP 4:record is inseted scucessfully":"STEP 4: Failed to insert");
			
//			5. process the result
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
