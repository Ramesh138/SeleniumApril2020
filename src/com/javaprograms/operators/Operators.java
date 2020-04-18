package com.javaprograms.operators;

public class Operators {
	
	public void addition() {
		
		int a=10;
		int b=20;
		int c;
		
		System.out.println("Addition operation");
		System.out.println(a+b);
		 c=a+b;
		 System.out.println(c);
			
	}
	
	public void module() {
		int a=30;
		
		int b=9;
		
		int c;
		
		c=a%b;
		
		System.out.println("Module value of "+c);
		
	}
	
	public void stringConcatination() {
		
		String name="Ramesh";
		
		int rollno=910138;
		
		System.out.println(" COncatination  Example "+name+" : "+rollno);
		
		int value=910138;
		
		int value1=910139;
		
		System.out.println(value+value1);
		
		System.out.println(" sum  of the two values "+value+value1); 
		
		System.out.println(" sum  of the two values "+(value+value1)); 
	}
	
	
	public void incrementAndDecrement() {
		
		int a=10;
		
		System.out.println(a++); //10
		
		System.out.println(++a);//12
		
		System.out.println(a--);//12
		
		System.out.println(--a);//10
		
	}
	
	public void assignmentOperators() {
		
		int a=10;
		
		int b=20;
				
		int c=10;
		
		System.out.println(a==b); //false
		
		System.out.println(a==c); //true
		
		
		System.out.println(a!=b); //true
		
		System.out.println(a^b);  //true
		
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		
	}
	
	public static void main(String[] args) {
		
		Operators ope=new Operators();
		
		ope.addition();
		ope.module();
		ope.incrementAndDecrement();
		ope.assignmentOperators();
		ope.stringConcatination();
		
	}

}
