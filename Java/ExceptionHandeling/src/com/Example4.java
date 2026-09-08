package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example4 {
	static void read() throws FileNotFoundException {
		FileReader f=new FileReader("Car.txt");
	}
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
