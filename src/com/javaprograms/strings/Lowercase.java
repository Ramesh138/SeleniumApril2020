package com.javaprograms.strings;

public class Lowercase {
public static void main(String[] args) {
	
	String Name="Ramesh Ponneri";
	
	String name="ramesh ponneri";
	
	String actual=Name.toLowerCase();
	
	System.out.println(actual);
	
	String expected=name.toLowerCase();
	
	System.out.println(expected);
	
	if (actual.equals(expected)) {
		System.out.println(" equal");
	}else {
		System.out.println("not Equal");
	}
}
}
