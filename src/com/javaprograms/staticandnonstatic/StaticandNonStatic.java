package com.javaprograms.staticandnonstatic;

public class StaticandNonStatic {
	
	int num =10;
	
	static int num1=20;
	
	static String name="Ramesh";
	
	 public void m1() {
		System.out.println(num);
		System.out.println(num1);
	}
	 
	 public static void m2() {
		System.out.println(num1);
	}
	 
	 public static void m3() {
		System.out.println(name);
	}
	 
	 public static void main(String[] args) {
		StaticandNonStatic sta= new StaticandNonStatic();
		
		sta.m1();
		
		sta.m2();
		
		sta.m3();
		
		m2();
		
		m3();
		
		System.out.println(sta.num);
		
		System.out.println(num1);
		
		
	}
	

}
