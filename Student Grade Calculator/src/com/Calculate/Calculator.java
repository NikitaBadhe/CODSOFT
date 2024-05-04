package com.Calculate;

import java.util.ArrayList;

public class Calculator {

	public static void calculate(int no, ArrayList<Integer> marks) {
		System.out.println("Total Marks : "+Calculator.totalMarks(marks)); 
		System.out.println("Percentage : "+Calculator.percentage(no, marks));
		System.out.println("Grade : "+Calculator.grade(no, marks));
	}

	public static int totalMarks(ArrayList<Integer> marks) {
		int totalMarks = 0;
		for (int i : marks) {
			totalMarks = totalMarks + i;
		}
		return totalMarks;
	}

	public static double percentage(int no,ArrayList<Integer> marks) {
		
		return (Calculator.totalMarks(marks)/no);
	}
	
	public static String grade(int no,ArrayList<Integer> marks) {
		double percentage= Calculator.percentage(no, marks);
		String grade=null;
		
		if(percentage>=90) {
			grade= "O";
		}
		else if(percentage>=80 && percentage<90) {
			grade= "A";
		}
		else if(percentage>=70 && percentage<80) {
			grade= "B";
		}
		else if(percentage>=60 && percentage<70) {
			grade= "C";
		}
		else if(percentage>=50 && percentage<60) {
			grade= "D";
		}
		else if(percentage>=40 && percentage<50) {
			grade= "E";
		}
		else {
			grade="F";
		}	
		return grade;
	}
	
	
}
