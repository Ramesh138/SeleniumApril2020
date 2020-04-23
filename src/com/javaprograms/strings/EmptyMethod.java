package com.javaprograms.strings;

public class EmptyMethod {
	public static void main(String[] args) {
		String names[]= {"Ramesh","Ravana","Ramana","","Gowri"};
		
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].isEmpty()) {
				System.out.println("value is null");
			}else {
				System.out.println(names[i]);
			}
		}
		
	}
}
