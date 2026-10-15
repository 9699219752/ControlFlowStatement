package com.switchStatement;

public class EvenOdd_Q6 {

	public static void main(String[] args) {

		int num = 1;

		switch (num % 2) {

		case 0:
			System.out.println("Number is Even :" + num);
			break;
		default:
            System.out.println("Number is Odd :" +num);
		}
	}
}
