package geek;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencySymbol {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double value = scanner.nextDouble();
		scanner.close();
		System.out.println("US: " + getSymbol(Locale.US, value));
		System.out
				.println("India: " + getSymbol(new Locale("en", "in"), value));
		System.out.println("China: " + getSymbol(Locale.CHINA, value));
		System.out.println("France: " + getSymbol(Locale.FRANCE, value));

	}

	private static String getSymbol(Locale locale, double value) {
		NumberFormat n = NumberFormat.getCurrencyInstance(locale);
		return n.format(value);
	}

}
