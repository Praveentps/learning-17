package com.learn.date;

import java.time.Instant;

public class Duration {

	public static void main(String[] args) throws InterruptedException {
		Instant now = Instant.now();
		//Thread.sleep(100);
		Instant end= Instant.now();
		java.time.Duration duration = java.time.Duration.between(now, end);
		System.out.println("duration"+duration.getNano());
	}

}
