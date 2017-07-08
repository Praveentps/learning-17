package com.learn.split;

public class Split {
public static void main(String[] args) {
	String s="now:2017-01-12T02:11:42.202Z";
	String[] s1= s.split(":", 2);
	for (int i = 0; i < s1.length; i++) {
		String string = s1[i];
		System.out.println(string);	
	}
	
}
	

}
