package geek.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			list.add(scanner.nextLine());
		}
		t=scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < t; i++) {
			try {
				String[] str = scanner.nextLine().split(" ");
				int line = Integer.parseInt(str[0]);
				int index = Integer.parseInt(str[1]);
				String[] numbers = list.get(line-1).split(" ");
				System.out.println(numbers[index]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}

		}
		scanner.nextLine();
		scanner.close();
	}
}
