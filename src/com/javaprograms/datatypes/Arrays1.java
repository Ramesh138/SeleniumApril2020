package com.javaprograms.datatypes;

public class Arrays1 {
	
	public static void main(String[] args) {
		int sal[]= {1000,200,500,600,9000};
		
		String names[]= {"Ram","sam","Mahi","Rohit","virat"};
		
		System.out.println(sal.length);
		
		for (int i = 0; i < sal.length; i++) {
			System.out.println(names[i]+"  :  "+sal[i]);
		}
	}

}
