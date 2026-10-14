package com.flowStatement;

public class Question_5 {

	public static void main(String[] args) {
		
		int year=2024;
		
		if( year % 400==0 || year % 4==0 && year !=100 ) {
			System.out.println("These is Leap Year");
		}else {
			System.out.println("These is not Leap Year");
		}
	}
}
