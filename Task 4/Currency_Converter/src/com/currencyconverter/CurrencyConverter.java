package com.currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		while (choice != 7) {
			System.out.println("\nCurrency Converter");
			System.out.println("1. US Dollar to Indian Rupees");
			System.out.println("2. Indian Rupees to US Dollar");
			System.out.println("3. Europen Euro to Indian Rupees");
			System.out.println("4. Indian Rupees to Europen Euro ");
			System.out.println("5. Europen Euro to US Dollar");
			System.out.println("6. US Dollar to Europen Euro ");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			if(choice==7) {
				break;
			}
			System.out.println("Enter amount to convert");
			double amount=scanner.nextDouble();
			switch (choice) {
				case 1: {
					System.out.println(amount+" $ = "+(83.27*amount)+" RS");
					break;
					
				}
				case 2:{
					System.out.println(amount+" RS = "+(0.012*amount)+" $");
					break;
				}
				case 3: {
					System.out.println(amount+" Euro = "+(83.27*amount)+" RS");
					break;
					
				}
				case 4:{
					System.out.println(amount+" RS ="+(0.011*amount)+"Euro");
					break;
				}
				case 5: {
					System.out.println(amount+" Euro = "+(1.07*amount)+" $");
					break;
					
				}
				case 6:{
					System.out.println(amount+" $ ="+(0.93*amount)+"Euro");
					break;
				}
				default:{
					System.out.println("Enter Rigth Choice");
				}
			}
		}
		System.out.println("Exit From System");
		scanner.close();
	}

}
