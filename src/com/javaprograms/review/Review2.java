package com.javaprograms.review;

public class Review2 {

	 void m6() {
		 Reviewconcept rev= new Reviewconcept();
				 rev.m1();
				 rev.m2();
				 rev.m4();
				 rev.m5();
		 System.out.println(" i am in another classs");
	 }
	 
	  public void m7() {
		  this.m6();
		   System.out.println(" i am  public for another class");
	  }
	  
	   public static void main(String[] args) {
		  
		   Review2 rev2= new Review2();
		   
		   rev2.m6();
		   rev2.m7();

	   }
}
