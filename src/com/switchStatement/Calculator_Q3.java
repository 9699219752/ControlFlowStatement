package com.switchStatement;

public class Calculator_Q3 {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 5;
		char op = '*';
		switch (op) {

		case '+':
			System.out.println(" Addition " + num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(" Substraction " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(" Multiplication " + num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(" Division " + num1 + " / " + num2 + "=  " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid Condition");

		}
	}
}
