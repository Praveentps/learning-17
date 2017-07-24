package geek.datastructure;

import java.util.Scanner;

public class Stack {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 while (sc.hasNext()) {		
	  String input=sc.next();
	    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	    System.out.println(input.isEmpty());
	 }
	    sc.close();
     
}
}
