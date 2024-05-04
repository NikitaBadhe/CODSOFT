package com.transaction;

import java.util.List;
import java.util.Scanner;

import com.customerdetails.CustomerDetails;

public class Deposite {
	

	public static void deposite(double amount,int pin, List<CustomerDetails> l) {
		for(CustomerDetails i:l) {
			if(pin==i.getPin()) {
				i.setBalanceForDeposit(amount);
				System.out.println(" Deposit Successfully ");
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("Account Balance : "+i.getBalance()); 
			}
		}
		
		
	}
}
