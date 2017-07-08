package com.learn.strings;

public class StringComparision {

	public static void main(String[] args) {

		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); 
		
		String z = " Hello World".trim();
		System.out.println(x == z);
		
		String x1 = new String("Hello World");
		String y1 = "Hello World";
		System.out.println(x1 == y1); 
	}

}
