package com.learn.strings;

public class Swap {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "xyz";
		System.out.println("Before swaping");
		System.out.println("Str1 is " + str1 + " Str2 is " + str2);
		swap(str1, str2);
		System.out.println("After swaping");
		System.out.println("Str1 is " + str1 + " Str2 is " + str2);
	}

	private static void swap(String str1, String str2) {
		System.out.println("Inside swap method");
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("Str1 is " + str1 + " Str2 is " + str2);

	}

}
