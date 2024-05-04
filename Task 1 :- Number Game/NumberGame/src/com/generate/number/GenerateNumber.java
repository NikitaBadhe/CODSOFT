package com.generate.number;

import java.util.Scanner;

public class GenerateNumber {

	public static void main(String args[]) {
		System.out.println("************************************************************************");
		System.out.println("                                Number Game                            *");
		System.out.println("************************************************************************");
		
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			char option='y';
			//random number in 1-100 generated automatically
			int a = 1 + (int) (Math.random() * 99);
			int guess;
			int count=1;
			System.out.println("I am thinking of a number from 1 to 100 ... guess what it is ?         *");
			//your guess
			guess = sc.nextInt();
			while(guess>0) {
				
			//This block of code will get execute only when your guess is same as system guess 
			if(guess==a) {
				System.out.println("************************************************************************");
				System.out.println("Congratulations.                                                       *");
				System.out.println("You guessed the number with "+count+" tries!                                   *");
				System.out.println("************************************************************************");
				
				System.out.println("Do you want to play again? Y/N                                         *");
				option=sc.next().charAt(0);
				if(option=='Y' || option=='y') {
					break;
				}
				if(option=='N' || option=='n') {
					System.out.println("Game Over");
					break;
				}
				
				
			}
			
			System.out.println("Your guess is wrong                                                    *");
			
			System.out.println("************************************************************************");

			if (guess > a) {
				System.out.println("Your guess is higher than my!                                          *");
				System.out.println("Guess smaller number than "+guess+"                                           *");

			} else if (guess < a) {
				System.out.println("Your guess is lower than my!                                           *");
				System.out.println("Guess greater number than "+guess+"                                           *");

			} 
			System.out.println("************************************************************************");
			
			System.out.println("Do you want to play again? Y/N                                         *");
			option=sc.next().charAt(0);
			if(option=='Y' || option=='y') {
				
			}
			if(option=='N' || option=='n') {
				System.out.println("Game Over                                                           *");
				break;
			}
			System.out.println("************************************************************************");
			System.out.println("Guess the number again                                                 *");
			guess = sc.nextInt();
			count++;
			
			}
			
			if((option=='Y' || option=='y')&& guess==a) {
		
			}
			else {
				break;
			}
		}
	}
}
