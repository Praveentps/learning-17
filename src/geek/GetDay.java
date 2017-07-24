package geek;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class GetDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt() - 1;
		int day = in.nextInt();
		int year = in.nextInt();
		in.close();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(TimeZone.getDefault());
		calendar.set(year, month, day);
		Date time = calendar.getTime();
		String[] days = time.toString().split(" ");		
		System.out.println(getDayOfWeek(days[0]).toUpperCase());
	}

	static private String getDayOfWeek(String value) {
		String day = "";
		switch (value) {
		case "Sun":
			day = "Sunday";
			break;
		case "Mon":
			day = "Monday";
			break;
		case "Tue":
			day = "Tuesday";
			break;
		case "Wed":
			day = "Wednesday";
			break;
		case "Thu":
			day = "Thursday";
			break;
		case "Fri":
			day = "Friday";
			break;
		case "Sat":
			day = "Saturday";
			break;
		}
		return day;
	}
}
