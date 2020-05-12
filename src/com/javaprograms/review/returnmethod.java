package com.javaprograms.review;

public class returnmethod {
	
	String value ;
	
	 public String name(String name) {
		 
		 String names[]= {"Rmesh","Suresh","Mahesh","Madesh"};
		 
		 for (int i = 0; i < names.length; i++) {
			
			 if (names[i].equals(value)) {
				 value =names[i];
				 System.out.println(value);
			}
			 
		}
		  
		return value;
		 
		
	 }
	 
	 public int age(int value) {
		  return value;
	  }
	  
	 public Boolean correct(Boolean value) {
		  return value;
	  }
	  
	   public  void BM(String name,int  age,boolean ccc) {
	    	 
	    	
	    	this.name(name);
	    	
	    	this.age(age);
	    	
	    	this.correct(ccc);
	    	
	    	System.out.println(name+ " "+ age+" "+" "+ccc);
	    }
	    
	     public static void main(String[] args) {
			
	    	  returnmethod re = new returnmethod();
	    	  re.BM("Ramesh",28,true);
	    	  
	    	  re.BM("jages" , 29, true);
		}

}
