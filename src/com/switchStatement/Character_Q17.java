package com.switchStatement;

public class Character_Q17 {

	public static void main(String[] args) {
		
		char ch='u';
		
		switch (ch) {
		
		case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' :
			System.out.println("UPPER CASE Letter  ");
			break;
		case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' :
			System.out.println("lOWER  CASE Letter  ");
			break;
			
//		case '0,1,2,3,4,5,6,7,8,9':
//			System.out.println("Digit");
//		break;
			
		default :
			System.out.println("Invalid ....!");
			
		}
	}
}
