package com.javaprograms.review;

public class Arrays {
	
	 public static void main(String[] args) {
		 String names[]= {"Ramesh","Suresh","Mahesh","Madesh"};
		 
		 String names1[][]= {{""},{""}}; // first index starts vth  0 and seconds will starts with 1
		 
		 int len= names.length;
		 
		 int len1=names1.length;
		 
		 System.out.println(len1);
		 
		 
		 System.out.println(len);
		 
		 for (int i = 0; i < len; i++) {
			 
			if(names[i].contains("Su")) {
				 System.out.println(names[i]);
			}
			
		}
	}

}
