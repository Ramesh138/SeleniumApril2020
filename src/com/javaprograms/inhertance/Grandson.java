package com.javaprograms.inhertance;

public class Grandson extends Father {
	
	public void property4() {
		System.out.println("i have one acree of land ");
	}
	
	public static void main(String[] args) {
		Grandson gs=new Grandson();
		gs.property();
		gs.property1();
		gs.property2();
		gs.property3();
		gs.property4();
		
	}

}
