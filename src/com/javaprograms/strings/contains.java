package com.javaprograms.strings;

public class contains {
	
	public static void main(String[] args) {
		String names[]= {"Ramesh","Ravana","Ramana","pradeep","Gowri"};
		
		for(int i=0;i<names.length;i++) {
			
			if(names[i].contains("e")) {
				
				System.out.println(names[i]);
			}
		}
	}
	
	

}
