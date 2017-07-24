package geek;

import java.util.*;
import java.io.*;

public class Series {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			System.out.println("n= : "+n);
			int sum = a;
			int counter = 1;
			sum += 1 * b;
			System.out.print(" " + sum);
			for (int j = 2; j <= n; j++) {
				counter *= 2;
				sum += counter * b;
				System.out.print(" " + sum);
			}

		}

		in.close();
	}
}
