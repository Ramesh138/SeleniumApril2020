package com.javaprograms.conditions;

import java.util.Scanner;

public class Ifelse {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" print the marks : ");
		
		int marks =sc.nextInt();
		
		if(marks>=35&&marks<60) {
			System.out.println(" Ramesh is passed the exam ");
		}else if (marks>=60&&marks<75) {
			System.out.println(" Gowri is passed the exam  in the first Class");
		}else if (marks>=75) {
			System.out.println(" Pradeep is passed the exam  in the Distinct Class");
		}else {
			System.out.println("All Ladies are Failed");
		}
	}

}
