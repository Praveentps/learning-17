package geek.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		int numberOfElements=in.nextInt();
		in.nextLine();
		String numbers=in.nextLine();		
		for(String number:numbers.split(" ")){
			list.add(Integer.parseInt(number));
		}
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String OpType = in.next();

			if (OpType.equals("Insert")) {
				int index = in.nextInt();
				int element = in.nextInt();
				list.add(index, element);
			} else {
				int index = in.nextInt();
				list.remove(index);
			}
		}
		for (int value : list)
			System.out.print(value+" ");

	}
}
