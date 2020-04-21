package com.javaprograms.datatypes;

public class ArraysExample {

	public static void main(String[] args) {

		int num1[][] = new int[5][6];

		int number1[][] = { { 1, 2, 3, 4, 20, 6, 7, 8, 9 }, { 1, 2, 3, 4, 50, 6, 7, 8 } };

		// 0============> {1,2,3,4,20,6,7,8,9}

		// 1=============>1,2,3,4,50,6,7,8
		int num[] = { 0, 0, 1563, 455, 7626, 5515, 65455};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println(number1[1][4]);

		/*
		 * System.out.println(number1[0].length);// 8
		 * 
		 * System.out.println(number1[1].length);// 7
		 * 
		 * System.out.println(number1.length); // 2
		 * 
		 * System.out.println(num.length);// 5
		 */
	}

}
