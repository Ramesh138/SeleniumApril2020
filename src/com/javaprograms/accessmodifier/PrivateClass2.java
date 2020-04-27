package com.javaprograms.accessmodifier;

public class PrivateClass2 {
	
	private int num=10;
	
	private void m1() {
		System.out.println("i am private Method"+num);	
	}
	
	public void m2() {
		System.out.println("i am public Method"+num);
		this.m1();
	}
	
	public static void main(String[] args) {
		PrivateClass2 pri=new PrivateClass2();
		
		System.out.println(pri.num);
		
		pri.m1();
	}

}
