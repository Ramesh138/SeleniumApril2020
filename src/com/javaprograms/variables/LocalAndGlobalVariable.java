package com.javaprograms.variables;

public class LocalAndGlobalVariable {
	
	 int num =10;
	 
	 int num1;
	 
	 public void m1() {
		System.out.println("M1 ="+num);
	}
	 
	 public void m2() {
		 int num =20;
		System.out.println("M2 = "+num);
	}
	 
	 public void m3() {
		num1=30;
		System.out.println("M3 = "+num1);
				
	}
	 
	public static void main(String[] args) {
		LocalAndGlobalVariable loc=new LocalAndGlobalVariable();
		
		loc.m1(); // global 
		loc.m2(); // local 
		loc.m3(); // local
	}

}
