package com.javaprograms.constructors;

public class SuperClass extends SampleClass {
	
	
	SuperClass(){
		super();
	}
	public void son1() {
		
		int num=20;  // local variable 
		
		System.out.println(super.num);
	System.out.println("i am the first son1");	
	}
	
	public void son2() {
	System.out.println("i am the second son1");	
	}
	
	public void property() {
		System.out.println("my father have one acre land1 ");
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * When we call same method from parent calss .Super method will give importance
		 * cureent class
		 * 
		 * Super keyword should be the first keyword  in the method
		 * 
		 * Super keyword should not be used in the Static class
		 */
		SuperClass sup= new SuperClass();
		
		sup.son1();
		
	}

}
