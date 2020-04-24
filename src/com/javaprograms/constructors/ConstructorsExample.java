package com.javaprograms.constructors;

public class ConstructorsExample {
	
 ConstructorsExample() {
	System.out.println(" I am Default Constructor");
}
 
 ConstructorsExample(int age){
	 System.out.println("my age is "+age); // Single Argument
 }
 
 ConstructorsExample(String name,int age){
	 System.out.println(" my Name and Age is  a "+ name+ " :"+age);// Multiple Argument
 }
 
 
 ConstructorsExample(int age,String name){// Multiple Argument
	 System.out.println(" my Name and Age is "+ name+ " :"+age);
 }
 
 void method1(int age,String name) {
	 System.out.println(" this room  is allocated to MR. SAM"+ name+ " :"+age);
 }
 
 void method1(String name,int age) {
	 System.out.println(" this room  is allocated to MR. SAM"+ name+ " :"+age);
 }
 public static void main(String[] args) {
	ConstructorsExample room=new ConstructorsExample();
	
	 room.method1(29,"Mahesh");
	
	 room= new ConstructorsExample("Ramesh",29);
	
	 room= new ConstructorsExample(29,"Ramesh");
	 
	 room= new ConstructorsExample(29,"Suresh");
	 
	 room= new ConstructorsExample(29,"Pradeep");
	 
	 room= new ConstructorsExample(29,"GOWRI");
	 
}
 
 
}
