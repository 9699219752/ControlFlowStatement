package com.flowStatement;

public class Question_12 {

	public static void main(String[] args) {
		
		int age=15;
		
		if(age>=18) {
			System.out.println("You are Eligible For Voting");
		   if (age>=25) {
			   System.out.println("Eligible for Contest IN Election");
		   }else {
			   System.out.println("Not Eligible for Contest In Election");
		   }
		}else {
			System.out.println("You are not Eligible For Voting");
		}
	}
}
