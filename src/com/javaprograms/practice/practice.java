package com.javaprograms.practice;

 class practice {
	 
	 
	 //Method Name should not be same 
	 
	/* primitive and non primitive */
	 
	/* primitive : int boolean char float short byte long double */
	 
	/* non primitive : string and Arrays */
	 
	/* access MOdifiers : public private protected and default */
	 
	 float fvalue=23.33f;
	 
	 long lvalue=12354l;
	 
	 double dvalue=2222.3333d;
	 
	 
	 String names[]= {"ramesh","mahesh"};
	 
	 int salary[]= {100,200,300,400,500};
	 
	 
	 char Gender[]= {'F','M'};
	 
	 
	 boolean flag[]= {true,false};
	 
	 
	 
	 int sal[]=new int[4];
	 
	 
	 
	public practice() {
		// TODO Auto-generated constructor stub
	}
	
	practice(int sal){
		
	}
	
	
	 
	
	 
	 public void intialization() {

		 System.out.println(sal.length);

		 for (int i = 0; i < 4 && i!=2; i++) {
			 
			 sal[i]=1000;
			 
			 int sal1[]=sal;
			 
			 
			 
		}
		 
	}
	 
	 int num=10;
	 void m1() {
		 int num =10;
		 System.out.println(num);
	 }
	 
	 void m2() {
		System.out.println(num); 
	 }
	 
	 
	 public static void main(String[] args) {
		
		 practice pra= new practice();
		 
		 pra.m1();
		 pra.m2();
		 pra.intialization();
		 
	}

}
