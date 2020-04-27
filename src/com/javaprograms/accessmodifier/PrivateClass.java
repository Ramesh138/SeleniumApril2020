package com.javaprograms.accessmodifier;

public class PrivateClass {
	/*
	 * private : private methods and variables can be accessed only from same class.
	 * We can not access It from other classes or sub classes of even same package.
	 */
	public static void main(String[] args) {
		PrivateClass2 pri= new PrivateClass2();
		pri.m2();
		System.out.println();
	}

}
