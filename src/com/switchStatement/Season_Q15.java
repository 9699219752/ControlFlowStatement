package com.switchStatement;

public class Season_Q15 {

	public static void main(String[] args) {
		
		int season=1;
		
		switch(season) {
		
		case 12,1,2:
			System.out.println("Winter");
		break;
		case 3,4,5:
			System.out.println("Summer");
		break;
		case 6,7,8:
			System.out.println("Mansoon");
		break;
		default:
			System.out.println("Null...!");
		break;
		
		
		}
			
	}
}
