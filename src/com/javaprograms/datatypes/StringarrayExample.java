package com.javaprograms.datatypes;

public class StringarrayExample {
	
	public static void main(String[] args) {
		String names[]= {"Ramesh","Pradeep","Gowri"};
		
		int rollno[]= {01,02,04,03};
		
		
		
		System.out.println(names.length);
		
		for (int i = 0; i < rollno.length&& i!=3; i++) {
			
			System.out.println(names[i]+" : "+rollno[i]);
		}
	}
	


}
