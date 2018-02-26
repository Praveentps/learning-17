package com.learn.abstraction;

class Example1 {
	public void display1() {
		System.out.println("display1 method");
	}
}

interface Ex extends Ex2{
	public void show();
}

abstract class Example2 {
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class Example6 {
	abstract public void display6();
}

abstract class Example3 extends Example6 implements Ex2,Ex5{
	abstract void display3();
	
}
interface Ex2{
	public void ex2();
}
interface Ex5{
	public void ex2();
}

class Example5 extends Example3{

	@Override
	public void ex2() {
		System.out.println("ex2 in the Example5");
	}

	@Override
	void display3() {
		System.out.println("example 5");
	}

	@Override
	public void display6() {

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
		System.out.println("ex2 in the Example4");
	}

	@Override
	public void display6() {

	}
}

class Ex1 implements Ex{

	@Override
	public void show() {
	System.out.println("ex1");	
	}

	@Override
	public void ex2() {

	}
}
class Demo {
	public static void main(String args[]) {
		Ex5 ex5 =new Example4();
		ex5.ex2();
		Example4 obj = new Example4();
		obj.display3();
		obj.show();
		Ex1 ex1= new Ex1();
		ex1.show();
		Example4 example4= new Example4();
		example4.display3();
	}
}