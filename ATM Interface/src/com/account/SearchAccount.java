package com.account;

import java.util.List;

import com.customerdetails.CustomerDetails;

public class SearchAccount {
	public static boolean searchAccount(int pin,List <CustomerDetails> l) {
		boolean result=false;
		for(CustomerDetails i:l) {
			if(pin==i.getPin()) {
				result=true;
			}
		}
		return result;
	}
}
