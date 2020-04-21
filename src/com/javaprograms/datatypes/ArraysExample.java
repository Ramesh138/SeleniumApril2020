package com.javaprograms.datatypes;

public class ArraysExample {
	
	public static void main(String[] args) {
		int number[][]=new int[9][9];
		
		int number1[][]= {{1,2,3,4,20,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		
	//	System.out.println(number1.length);
		
		System.out.println(number1.length);
		for (int i = 0; i < number1.length; i++) {
			System.out.println();
			for (int j = 0; j <=number1[i].length; j++) {
				
				System.out.println(number1[i][j]);
			}
		}
		
		
		
		/*
		 * for (int i = 0; i < number.length; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
	}

}
