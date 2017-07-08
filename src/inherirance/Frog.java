package inherirance;

interface CanHop {}
public class Frog implements CanHop {
 public static void main(String[] args) {
	 System.out.println("main");
	 TurtleFrog frog = new TurtleFrog();
	 frog.fun();
 }
 }
 class BrazilianHornedFrog extends Frog {}
 class TurtleFrog extends Frog {
	 void fun(){
		 System.out.println("child");
	 }
 }