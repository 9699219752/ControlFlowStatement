package com.switchStatement;

public class ATM_Q20 {

	public static void main(String[] args) {

		int atm = 1;

		switch (atm) {

		case 1:
			System.out.println("Check Balance");
			break;
		case 2:
			System.out.println("Withdraw");
			break;
		case 3:
			System.out.println("Deposit");
			break;

		default:
            System.out.println("Exit");
		}

	}
}
