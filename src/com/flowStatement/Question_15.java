package com.flowStatement;

public class Question_15 {

	public static void main(String[] args) {
		
		int number=60;
		
		if (number%2 ==0) {
			System.out.println("It is Even Number");
			if (number>50) {
				System.out.println("The number is greater than 50");
			}else {
				System.out.println("The number is not Greater than 50");
			}
		}else {
			System.out.println("the number is not even");
		}
	}
}
