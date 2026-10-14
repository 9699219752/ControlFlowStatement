package com.flowStatement;

public class Question_9 {

	public static void main(String[] args) {
		
		int age =34;
		
		if(age > 0 && age<12) {
			System.out.println("Child");
		}else if (age>13 && age<19) {
			System.out.println("Teenager");
		}else if (age>20 && age<59) {
			System.out.println("Adult");
		}else if (age> 60) {
			System.out.println("Senior Citizen");
		}else {
			System.out.println("Not Valid");
		}
		
	}
}
