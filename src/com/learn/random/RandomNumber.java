package com.learn.random;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class RandomNumber {
public static void main(String[] args) {
	Random r = new Random();
	for(int i =0;i<5;i++){
	int expiryDays = r.nextInt(15) + 8;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	Calendar calendar = Calendar.getInstance();
	Date date=new Date(); 
	String startDate=format.format(date);
	calendar.setTime(date);     
	calendar.add(Calendar.DATE, expiryDays);       
	date= calendar.getTime();        
	String endDate=format.format(date); 
	//System.out.println("srt"+startDate);
	System.out.println("end"+endDate);
	}
}
}
