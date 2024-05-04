package com.transaction;

import java.util.List;
import java.util.Scanner;

import com.customerdetails.CustomerDetails;

public class Withdraw {

	public static void withdraw(double amount,int pin, List<CustomerDetails> l) {
		for(CustomerDetails i:l) {
			if(pin==(i.getPin())) {
				i.setBalanceForWithdraw(amount);
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println(" Account Balance : "+i.getBalance()); 
				
			}
				
		}
		
		
	}
}
