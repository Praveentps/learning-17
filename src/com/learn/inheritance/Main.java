package com.learn.inheritance;

public class Main {

	public static void main(String[] args) {

		B b = new B();
		A a = b;
		a.show();
		b.show();
		System.out.println(a.x);
		System.out.println(b.x);
		A aa= new A();
		aa.show();
		System.out.println(aa.x);

	}

}
