package com.javaprograms.review;

public class inheritance extends constructors {
	int num =20;
	inheritance(){
		super();
	}
	
	public void method() {
		
		
		try {
			System.out.println(this.num);
			m2();
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println(" ENd of the ");
		}
		constructors con= new constructors();
		constructors con1= new constructors("Ramesh ");
	}
	
	 public static void main(String[] args) {
		inheritance in = new inheritance();
		in.method();
	}

}
