package com.javaprograms.returnconcept;

import com.javaprograms.accessmodifier.public1;

public class Sample1 {
	
	private int amount(int amountvalue ) {
	return amountvalue;
}


private String employee(String name) {	
	return name;
}

private String eid(String eid) {	
	return eid;	
}

private int phnumber(int ph) {
	
	return ph;
}


public  void employeDetails(String name,String eid,int ph,int salary) {
	
	
	 name=this.employee(name);
	
	
	 eid=this.eid(eid);
	
	
	 ph=this.phnumber(ph);
	
	 salary=this.amount(salary);
	
	System.out.println(name+" "+eid+"    "  +ph+"    "+salary);
}

public static void main(String[] args) {
	
	Sample1 sam1=new Sample1();
	sam1.employeDetails("Ramesh","z011615",99456,10000);
	sam1.employeDetails("suresh","z011616",99456,20000);
	
}




}
