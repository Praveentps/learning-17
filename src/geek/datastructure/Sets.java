package geek.datastructure;

import java.util.HashSet;
import java.util.Scanner;

public class Sets {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		HashSet<String> pairs = new HashSet<String>(t);
		for (int i = 0; i < t; i++) {
			pairs.add("(" + s.next() + ", " + s.next() + ")");
			System.out.println(pairs.size());
		}
		s.close();
	}
}
