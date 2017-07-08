package com.learn.abstraction;

class Example1 {
	public void display1() {
		System.out.println("display1 method");
	}
}

interface Ex {
	public void show();
}

abstract class Example2 {
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class Example3 implements Ex2 {
	abstract void display3();
	
}
interface Ex2{
	public void ex2();
}

class Example5 extends Example3{

	@Override
	public void ex2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display3() {
		// TODO Auto-generated method stub
		
	}
	
}
class Example4 extends Example3 implements Ex,Ex2 {
	public void display3() {
		System.out.println("display3 method");
	}

	@Override
	public void show() {
		System.out.println("Example4");
		
	}

	@Override
	public void ex2() {
		// TODO Auto-generated method stub
		
	}
}

class Ex1 implements Ex{

	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("ex1");	
	}
	
}
class Demo {
	public static void main(String args[]) {
		Example4 obj = new Example4();
		obj.display3();
		obj.show();
		Ex1 ex1= new Ex1();
		ex1.show();
	}
}