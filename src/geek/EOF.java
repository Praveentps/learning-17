package geek;

import java.util.Scanner;

public class EOF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (scanner.hasNext()) {
			String string = (String) scanner.nextLine();
			System.out.println(counter++ + " " + string);
		}
		scanner.close();
	}

}
