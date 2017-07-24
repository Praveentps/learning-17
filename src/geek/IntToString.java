package geek;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		String str = new String();
		str+=number;
		System.out.println(number==Integer.parseInt(str));
		/*while (number>0) {
			int reminder=number%10;
			str+=reminder;
			number/=10;
			
		}*/
		System.out.println(str);

	}

}
