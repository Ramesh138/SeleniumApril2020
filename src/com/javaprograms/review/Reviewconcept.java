package com.javaprograms.review;

  class Reviewconcept {
	
	//variable 
	
	//it is constant value which we are giving to data type;
	
	
	//for EXample : int num ; num is the variable  and this called declaration and also called as identifier 
	
	int num ; // Specifying the type of the value or variable or identifier is nothing but declaration 
	
	int num1 =10; // intialization  Assigning some value to the particular variable 
	
	/*
	 * byte short int long ================ integer or numerical type
	 * 
	 * float and double =================== is the floating type
	 * 
	 * boolean =================== is the boolean type (true or false )
	 * 
	 * char ================= character type ( value should be single quote and
	 * sigle Character )
	 */
	
	
	float flo=12.33f;
	
	double dou=12223333.34d;
	
	
	long lo= 1211313131323l;
	
	byte by=120;
	
	char ch='M';
	
	boolean flag= true;//  by default value false 
	
	
	
	public void m1() {  // public can access anywhre in the project 
		System.out.println(" Method 1");
	}
	
	void m2() {
		System.out.println(" Default method "); // Default can be accessed only in thecurrent package 
	}
	
	private void m3() {
		System.out.println(" only for the particular class"); // if we want access other class  then we need  make it public then only we can call 
	}
	
	 protected void m4() {
		 System.out.println(" only access for the current package and similar to default ");
		 // diference between protected and default is  class can be default but not protected 
	 }
	
	
	 public static void m5() {
		  System.out.println(" this  method can call directly  without the object because it already have address insie");
	 }
	 
	 
	 public static void main(String[] args) {
		
		 Reviewconcept rev= new Reviewconcept();
		 
		 rev.m1();
		 rev.m2();
		 rev.m3();
		 rev.m4();
		 rev.m5();
	}
	
	

}
