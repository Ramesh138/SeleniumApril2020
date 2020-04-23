package com.javaprograms.conditions;

import java.util.Scanner;

public class Switchcase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the day  values");
		
		String day=sc.nextLine();
		
		int a = 10,b = 20;
		
		int c=a+b;
		int d=a*b;
		int e=a-b;
		
		
		switch (day) {
		case "addition":
			System.out.println(c);
			System.out.println("Monday");
			System.out.println(c);
			System.out.println("Monday");
			System.out.println(c);
			System.out.println("Monday");
			System.out.println(c);
			System.out.println("Monday");
			break;
		case "Substration":
			System.out.println(d);
			System.out.println("thuesDay");
			break;
		case "Multiflication":
			System.out.println(e);
			System.out.println("Wensday");
			break;
	
		default:
			System.out.println();
			break;
		}
	}

}
