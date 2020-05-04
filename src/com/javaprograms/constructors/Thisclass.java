package com.javaprograms.constructors;

public class Thisclass {
	

	int num=10;  // global variables
	
	int  num1=11;// global variables 
	
	//we can access methods and variables   in the same class  without creating Object .
	
	// this key word should not able to access static methods
	
	public  void thisExampleM1(int num,int num1) { // local variable
		
		System.out.println( this.num+"  ====   "+this.num1);
	}
	
	
	public String  exampleM2() {
		
		String value=this.exampleM3();
		System.out.println(value);
		
		return value;
	}
	
	public String exampleM3() {
		
		return "Ramesh";
	}
	
	public void exampleM4() {
		
		System.out.println(this.exampleM2());
		
	}
	
	public static void main(String[] args) {
		
		Thisclass thi= new Thisclass();
		
		
		thi.thisExampleM1(20, 20);
	}

}
