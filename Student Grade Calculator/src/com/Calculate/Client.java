package com.Calculate;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int no=sc.nextInt();
		ArrayList<Integer> marks=new ArrayList<>();
		for(int i=1;i<=no;i++) {
			System.out.println("Enter marks for subject no " +i);
			marks.add(sc.nextInt());
		}
		System.out.println("_____________________________________________________");
		Calculator.calculate(no,marks);
		
	}
}
