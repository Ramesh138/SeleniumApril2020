package com.javaprograms.accessmodifier;


/*public : We can access public methods or variables from all class of same package or other package.
private : private methods and variables can be accessed only from same class. We can not access It from other classes or sub classes of even same package.
protected : protected methods can be accessed from classes of same package or sub classes of that class.
No Access Modifier : If method have not any access modifier then we can access It Inside all class of same package only.
Now let me show you practical difference between all these 4 access modifiers in java software development language. I have created 3 classes as bellow. Two(Accessmodif, Access) of them are in same package Test_Package1 and one class (Accessing) is in other package named Test_Package2 of same project. Class Accessing is child class of Accessmodif class.
*/
public class Accespecifier {

	 public static int i=10;
	 private static String str="Hello";
	 protected static double d=30.235;
	 static char c='g';
	 
	 public static void main(String[] args) {
	  Testing_pub();
	  Testing_pri();
	  Testing_pro();
	 }
	 
	 //Method with public access modifier. Can be accessible by any class and any package.
	 public static void Testing_pub(){
	  System.out.println("Testing_pub() Executed");
	  System.out.println("Value Of i Is "+i);
	  System.out.println("Value Of str Is "+str);
	  System.out.println("Value Of d Is "+d);
	  System.out.println("Value Of c Is "+c);
	 }
	 
	 //Method with private access modifier. Can be accessible from same class only.
	 private static void Testing_pri(){
	  System.out.println("Testing_pri() Executed"); 
	 }
	 
	 //Method with protected access modifier. Can be accessible from any class of same package or sub class of this class.
	 protected static void Testing_pro(){
	  System.out.println("Testing_pro() Executed");
	 }
	 
	
	}
