package com.javaprograms.crossingobject;

import com.javaprograms.constructors.ConstructorsExample;

public class Sample3 {

	public void sample3NonStaticMethod() {

		System.out.println("i am non ststic method");
	}

	public static void sample3StaticMethod() {

		System.out.println("i am ststic method");

	}
	
	
	public static void main(String[] args) {
		Sample1 sam1=new Sample1();
		Sample2 sam2=new Sample2();
		Sample3 sam3= new Sample3();
		ConstructorsExample con= new ConstructorsExample();
		
		sam2.sample2NonStaticMethod();
		sam2.sample2StaticMethod();
		
		Sample1.sample1StaticMethod();
		sam1.sample1NonStaticMethod();
		
		sam3.sample3NonStaticMethod();
		sam3.sample3StaticMethod();
		
		con.method1(23, "Pradeep");
	}
}
