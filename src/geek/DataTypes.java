package geek;

import java.util.*;
import java.io.*;

public class DataTypes {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			try {
				sc.nextLine();
				long x = sc.nextLong();
				
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte \n* short \n* int \n* long");
				else if (x >= -Short.MAX_VALUE && x <= Short.MAX_VALUE - 1)
					System.out.println("* short \n* int \n* long");
				else if (x >= -Integer.MAX_VALUE && x <= Integer.MAX_VALUE - 1)
					System.out.println("* int \n* long");
				else if (x >= -Long.MAX_VALUE && x <= Long.MAX_VALUE - 1)
					System.out.println("* long");

				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
