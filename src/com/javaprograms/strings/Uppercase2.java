package com.javaprograms.strings;

public class Uppercase2 {
public static void main(String[] args) {
	
	String Name="Ramesh Ponneri";
	
	String name="ramesh ponneri";
	
	String actual=Name.toUpperCase();
	
	System.out.println(actual);
	
	String expected=name.toUpperCase();
	
	System.out.println(expected);
	
	if (actual.equals(expected)) {
		System.out.println(" equal");
	}else {
		System.out.println("not Equal");
	}
}
}
