package com.javaprograms.constructors;

public class Manager extends Admin {
	
	int num =20;
	
	public void locaker1() {
		
		String key ="local locaker Key";
		System.out.println("i have "+super.key);
		
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		Manager man= new Manager();
		
		man.locaker1();
	}

}
