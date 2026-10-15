package com.switchStatement;

public class Operator_Q9 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		char c = '-';

		switch (c) {

		case '+':
			System.out.println(" Addition " + a + "+" + b + "=" + (a + b));
			break;
		case '-':
			System.out.println(" Substraction " + a + "-" + b + "=" + (a - b));
			break;
		case '*':
			System.out.println(" Multiplication " + a + "*" + b + "=" + (a * b));
			break;

		case '/':
			System.out.println(" Division " + a + "/" + b + "=" + (a / b));
			break;
		default:
			System.out.println("Invalid Operation...!");

		}
	}
}
