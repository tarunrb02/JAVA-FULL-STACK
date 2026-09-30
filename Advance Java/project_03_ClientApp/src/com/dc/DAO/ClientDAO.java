package com.dc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.dc.util.JDBC_Config;

public class ClientDAO {
	
	Scanner sc=new Scanner(System.in);
	
	public int addClient() {
		System.out.println("Adding a client.....");
		int res=0;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			String url="jdbc:mysql://localhost:3306/DC_ADV_21_SEP";
//			String userName="root";
//			String password="Tarunrb@123";
//			Connection con = DriverManager.getConnection(url,userName,password);
			
			Connection con = JDBC_Config.con();
			String sql="INSERT INTO CLIENT VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			System.out.println("Enter user Id");
			int id = sc.nextInt();

			System.out.println("Enter Client Name");
			String clientName = sc.next();

			System.out.println("Enter Comapny Name");
			String companyName = sc.next();

			System.out.println("Enter Email");
			String email = sc.next();
		
			System.out.println("Enter phone Number");
			long phone = sc.nextLong();
			
			stmt.setInt(1, id);
			stmt.setString(2, clientName);
			stmt.setString(3, companyName);
			stmt.setString(4, email);
			stmt.setLong(5, phone);
			
			res = stmt.executeUpdate();
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}
	
	public void getAllClient() {
		System.out.println("Get All Client.....");
	}
	
	public void getClientbyID() {
		System.out.println("Get Client by ID.....");
		System.out.println("Enter client id: ");
		int id=sc.nextInt();
		try {
			Connection con = JDBC_Config.con();
			String sql="select * from client where client_id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				System.out.println("Client ID: "+resultSet.getInt(1)+" Client Name: "+resultSet.getString(3));
				resultSet.next();
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateClient() {
		System.out.println("Updating a Existing client.....");
	}
	
	public void deleteClient() {
		System.out.println("Deleting a client.....");
	}
}
