package com.javaprograms.datatypes;

public class Father {
	
	public void son1() {
	System.out.println("i am the first son");	
	}
	
	public void son2() {
	System.out.println("i am the second son");	
	}
	
	public void property() {
		System.out.println("my father have one acre land ");
	}
	
	public static void main(String[] args) {
		
		
		
		Father fat=new Father();
		System.out.println(fat);
		fat.son1();
		fat.son2();
		fat.property();
		

		
	}

}
