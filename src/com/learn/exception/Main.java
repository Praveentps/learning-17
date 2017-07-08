package com.learn.exception;

public class Main {
	public static void main(String[] args) {
		try {
			int data = 25 / 1;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
