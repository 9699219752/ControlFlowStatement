package com.flowStatement;

public class Question_7 {

	public static void main(String[] args) {
		
		int marks = 97;
		
		if (marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}else if (marks >= 75 && marks<=89) {
			System.out.println("Grade B");
		}else if (marks >= 50 && marks<=74) {
			System.out.println("Grade C");
		}else if (marks >= 35 && marks<=49) {
			System.out.println("Grade D");
		}else if(marks <35) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid Marks");
		}
		
			
	}
}
