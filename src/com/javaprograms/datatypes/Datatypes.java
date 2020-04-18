package com.javaprograms.datatypes;

public class Datatypes {
	
	public void intergermethod(){
		/* Integer Category */
		
		/* byte >> short >> int >> long */
		
		/*
		 * Java is case sensitive language
		 * 
		 * varaibales are user defined values
		 */
		
		int num1;   /* declartion */
		
		num1 = 200; /* intialization */

		int num = 2147483647;

		short sho = 32767;

		long lo = 2147483647l;

		byte by = 127;
		
		System.out.println(num1);

		System.out.println(num);

		System.out.println(sho);

		System.out.println(lo);

		System.out.println(by);


	}
	
	public void booleanMethod() {
		/* Boolean Category */

		boolean flag = false;

		System.out.println(flag);

	}
	
	public void charcterMethod() {
		/* Character category */

		char ch = 'R';

		System.out.println(ch);


	}
	
	public void floatMethod() {
		/* floating catagory */

		float f = 12154.02f;

		double d = 100000.01d;

		System.out.println(f);
		System.out.println(d);
	}

	public static void main(String[] args) {

Datatypes dat= new Datatypes();
dat.intergermethod();
dat.charcterMethod();
dat.booleanMethod();
dat.floatMethod();
	
	}

}
