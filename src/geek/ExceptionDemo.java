package geek;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Scanner scanner =new Scanner(System.in);
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			scanner.close();
			int z=x/y;
			System.out.println(z);
		} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
		}catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}
}
