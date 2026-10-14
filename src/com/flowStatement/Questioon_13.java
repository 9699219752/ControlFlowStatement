package com.flowStatement;

public class Questioon_13 {

	public static void main(String[] args) {
		
		int year=2024;
		
		if (year%400==0 || year%4==0 && year!=100) {
			System.out.println("These is leap Year");
		  if (year%100 ==0) {
			  System.out.println("It is Century Year");
		  }else {
			  System.out.println("It is not Century Year");
		  }
		}else {
			System.out.println("Thes is Not leap Year");
		}
		
			
			
	}
}
