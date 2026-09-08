package com;

public class Example3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			String msg=e.getMessage();
			System.out.println(msg);
			System.out.println(e.getMessage());
		}
	}
}
