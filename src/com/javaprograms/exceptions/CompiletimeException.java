package com.javaprograms.exceptions;

public class CompiletimeException {

	// Compile time error : are program related and logic related

	// Arthematic exception , arrayoutofboundexception

	int num = 10;

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(100);

		int c;
		
			int a = 10;

			int b = 0;
			
			int e=20;

			try {
				c = a / b; //// i am doing  fail  here 
				System.out.println("i am the calculation "+c);/// logic 
			} catch (ArithmeticException arth) {
				c=e/b;
				//System.out.println("i am the calculation "+c); // we will catch the exception 
				
				throw new Error(" i am calculation");
			}finally {
				System.out.println("the calculation is wrong ...Go and refund the amound"); //
			}
	
	}

}
