package com.javaprograms.returnconcept;

public class Returnmethod {
	
	
	public boolean lname() {      //  return    
		
		String lname="Ponneri";
		
		int roi,i;
		
		int accountbalance=1000;
		boolean flag=true;
		
		
		if (lname.equals("Ponneri")) {
			
			System.out.println("if account presnt ");
			return flag;
		} else {

			System.out.println(" account not present ");
			return false;
		}
		

		
	}
	
	public void fname() {       // no  return method
		
		Returnmethod r=new Returnmethod();
		r.lname();
		
		boolean  bal=r.lname();
		
		String fname="Ramesh";
		
		System.out.println(fname+ ": "+bal);
		
	}
	
	public static void main(String[] args) {
		Returnmethod r=new Returnmethod();
		
		r.fname();
	}

}
