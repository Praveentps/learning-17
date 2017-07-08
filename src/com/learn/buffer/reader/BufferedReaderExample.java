package com.learn.buffer.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your name");
		String line = br.readLine();
		String[] names=line.split(" ");
		System.out.println(names.length);
		System.out.println("Welcome " + names[names.length-1]);
	}

}
