package com.javaprograms.strings;

public class Startswith2 {
	
	public static void main(String[] args) {
		String names[]= {"Ramesh","Ravana","Ramana","pradeep","Gowri","PradEep"};
		
		for(int i=0;i<names.length;i++) {
			
			if(names[i].startsWith("Ra")) {
				
				System.out.println(names[i]);
			}
		}
	}

}
