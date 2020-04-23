package com.javaprograms.strings;

public class Endswith {
	
	public static void main(String[] args) {
		String names[]= {"Ramesh","Ravana","Ramana","pradeep","Gowri","PradEep"};
		
		for(int i=0;i<names.length;i++) {
			
			if(names[i].endsWith("na")) {
				
				System.out.println(names[i]);
			}
		}
	}

}
