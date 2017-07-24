package geek.datastructure;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		HashMap<String, Integer> persons = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			persons.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (persons.containsKey(s))
				System.out.println(s + "=" + persons.get(s));
			else System.out.println("Not found");
		}
		in.close();

	}
}
