package com.javaprograms.strings;

public class SplitMethod {
	
	public static void main(String[] args) {
		
		String name="Ramesh,Ponneri,is,a,strudent";
		
		String names[]=name.split(","); //{"Ramesh",""Ponneri"}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("first name "+names[0]);
		
		System.out.println("Last name "+names[1]);
		
	}

}
