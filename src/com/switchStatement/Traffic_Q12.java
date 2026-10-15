package com.switchStatement;

public class Traffic_Q12 {

	public static void main(String[] args) {

		String color = "Green";

		switch (color) {
		case "Red":
			System.out.println("Stop..");
			break;
		case "Yellow":
			System.out.println("Ready To Go..");
			break;
		case "Green":
			System.out.println("Go..");
			break;
		default:
			System.out.println("Error");
		}
	}
}
