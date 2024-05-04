package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.account.CreateAccount;
import com.account.SearchAccount;
import com.customerdetails.CustomerDetails;
import com.transaction.Deposite;
import com.transaction.Withdraw;

public class Client {
	public static void main(String[] args) {
		List<CustomerDetails> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of customers you want to add ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter customer No " + i);
			CustomerDetails c = CreateAccount.createAccount();
			l.add(c);
		}

		System.out.println("****************************** Banking Application ***************************");
		int ch = 0;
		int count=0;
		int pin=0;
		while (ch != 5 ) {
			System.out.println(" Enter 1 to create new Account \n Enter 2 to search Account \n Enter 3 for Diposite money \n Enter 4 for withdraw money \n Enter 5 for exit from system ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			System.out.println("-------------------------------------------------------------------------------");
			switch (ch) {
			case 1:
				System.out.println("Enter pin No : ");
				pin=sc.nextInt();
				for(CustomerDetails i:l) {
					if(pin==i.getPin()) {
						System.out.println("Account is already Exist ");
						System.out.println("-------------------------------------------------------------------------------");
						break;
					}
					else {
						CustomerDetails c = CreateAccount.createAccount();
						l.add(c);
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter pin No ");
				pin = sc.nextInt();
				boolean found=SearchAccount.searchAccount(pin, l);
				if(found==true) {
					for(CustomerDetails i:l) {
						if(pin==i.getPin()) {
							i.showAccount();
							count=0;
							break;
						}
					}
					
				}
				else {
					System.out.println("your account Don't Exist");
					count++;
				}
				System.out.println("-------------------------------------------------------------------------------");
				break;
			case 3:
				System.out.println("Enter pin of user in which you want to Deposite money ");
				pin = sc.nextInt();
				System.out.println("-------------------------------------------------------------------------------");
				if(SearchAccount.searchAccount(pin, l) == true) {
					System.out.println("Enter amount ");
					double amount=sc.nextDouble();
					Deposite.deposite(amount,pin, l);
					count=0;
				}
				else {
					System.out.println(" Invalid user ");
					count++;
				}
				System.out.println("-------------------------------------------------------------------------------");
				break;

			case 4:
				
				System.out.println("Enter account no from which you want to withdraw money");
				pin = sc.nextInt();
				System.out.println("-------------------------------------------------------------------------------");
				if(SearchAccount.searchAccount(pin, l)==true) {
					System.out.println("Enter Amount ");
					double amount=sc.nextDouble();
					Withdraw.withdraw(amount,pin, l);
					count=0;
				}
				else {
					System.out.println(" Invalid user ");
					count++;
				}
				System.out.println("-------------------------------------------------------------------------------");
				break;

			case 5:
				System.out.println("************************** See you soon **************************");
				System.out.println("************************** Out from Banking Application **************************");
				break;

			default:
				System.out.println(" Enter Correct Choice ");

			}
			if(count==1) {
				System.out.println(" you have entered wrong account no ");
				System.out.println(" Please enter correct account no ");
				System.out.println(" 2 chance remaining");
				System.out.println(" your account will be block for 48hr after two wrong try");
				System.out.println("-------------------------------------------------------------------------------");
			}
			else if(count==2) {
				System.out.println(" you have entered wrong account no for 2 times ");
				System.out.println(" Please enter correct account no ");
				System.out.println(" 1 chance remaining");
				System.out.println(" your account will be block for 48hr after one wrong try");
				System.out.println("-------------------------------------------------------------------------------");
			}
			else if(count==3) {
				System.out.println(" You have Entered wrong details for 3 times ");
				System.out.println(" So your account is blocked for 48 hr  ");
				System.out.println("************************** See you soon **************************");
				System.out.println("-------------------------------------------------------------------------------");
				break;
			}
		}
		

	}
}
