package com.learn.exception;

public class Main {
	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);

		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			System.out.println(e);
			return;
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("ArithmeticException");
			return;
		}
		catch (Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
