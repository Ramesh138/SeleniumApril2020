package com.javaprograms.review;

public class Switch {

	public void condition(String day) {

		switch (day) {
		case "MON":
			System.out.println(" today is MOnday");
			break;
		case "THU":
			System.out.println(" today is Thuesday");
			break;
		case "WEN":
			System.out.println(" today is Thuesday");
			break;
		default:
			break;
		}
	}

	public void whilecondition() {

		String names[] = { "Ramesh", "Suresh", "Mahesh", "Madesh" };

		int i = 0;

		while (i < names.length) {

			if(names[i].contains("Su")) {
				 System.out.println(names[i]);
			}
			i++;

		}
	}

	public static void main(String[] args) {

		Switch swi = new Switch();

		swi.condition("THU");
		swi.whilecondition();

	}

}
