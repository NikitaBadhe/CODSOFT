package com.account;
import java.util.Scanner;

import com.customerdetails.CustomerDetails;
public class CreateAccount {
	public static CustomerDetails createAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Account No : ");
		String accountNo=sc.next();
		System.out.println("Enter Pin No : ");
		int pin=sc.nextInt();
		System.out.println("Enter Account Type : ");
		String accountType=sc.next();
		System.out.println("Enter Balance : ");
		double balance=sc.nextDouble();
		System.out.println("Enter AdharNo : ");
		String adharNo=sc.next();
		CustomerDetails c=new CustomerDetails(name,accountNo,pin,accountType,balance,adharNo);
		System.out.println("-------------------------------------------------------------------------------");
		return c;
	}
}
