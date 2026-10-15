package com.switchStatement;

public class Vowels_Q4 {
	
	public static void main(String[] args) {
		
		
		char vowels='x';
		
		switch (vowels) {
		
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("Vowels :" +vowels);
		break;
		
		default :
			System.out.println("Consenent ...!");
		}
	}

}
