package com.javaprograms.review;

public class constructors {
	
	int num=10;
	
	public constructors() {
		// TODO Auto-generated constructor stub
		
		System.out.println(" I am default constructor");
	}
	
	constructors(String name){
		System.out.println(" i am sigle argument  constructor "+name);
		
		returnmethod re= new returnmethod();
		re.BM("Ramesh", 28, true);
	}
	
	
	 public void m2() {
		 System.out.println(" method 2");
	 }
	public static void main(String[] args) {
		
		constructors con= new constructors();
		constructors con1= new constructors(" Ramesh");
	}

}
