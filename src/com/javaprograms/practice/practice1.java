package com.javaprograms.practice;

public class practice1 {
	
	
	static int num=10;
	int num1=20;
	
	public static void m1() {
	System.out.println("i am static ");	
	}
	
	public  void m2() {
		System.out.println("i am not ststic ");
	}
	
	public static void main(String[] args) {
		
		practice1 prac= new practice1();
		
		System.out.println(prac.num1);
		
		System.out.println(num);
		
		m1();
		
		prac.m2();
		
	}

}
