package geek;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Write your code here.
		int i = scan.nextInt();	
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
	}
}
