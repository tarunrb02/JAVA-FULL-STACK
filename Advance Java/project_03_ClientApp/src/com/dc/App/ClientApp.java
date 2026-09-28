package com.dc.App;

import java.util.Scanner;

import com.dc.DAO.ClientDAO;

public class ClientApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- WelCome TO Client App --------");
		
		System.out.println("\n Make your choise"
				+"\n 1. Add Client"
				+"\n 2. Get All Client "
				+"\n 3. Get Client by ID"
				+"\n 4. Update Exiting Client"
				+"\n 5. Delete a client"
				+"\n 6. Exit");
		int choice=sc.nextInt();
		
		Integer
		switch (choice) {
			case 1 ->new ClientDAO().addClient();
			
			case 6->System.exit(choice);
			default -> System.out.println("Unexpected value: " + choice);
		}
	}

}
