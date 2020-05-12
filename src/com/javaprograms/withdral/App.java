package com.javaprograms.withdral;

public class App {
	
	
	private  int amount(int value) {
		
		if (value < 3000) {
			return value;
		}else if (value < 4000) {
			return value;
		}else if (value < 10000) {
			
			return value;
		}else {
			System.out.println(" withdraw is morethan availbale balance");
		}
		
		
		System.out.println(value);
		return value;
		
		
	}
	
	private int total() {
		
		System.out.println(10000);
		return 10000  ;
	}
	
	
	 public  int withdral(int amount) {
		 
		int wamount=this.amount(amount)  ;
		
		
		int bal=total()-wamount;
		
		return bal;
		
	
		 
	 }
	 
	  public static void main(String[] args) {
		App a= new App();
		
		int bal=a.withdral(9000);
		
		System.out.println(" Balance "+ bal);
	}
	 
	 

}
