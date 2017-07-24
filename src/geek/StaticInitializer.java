package geek;

import java.util.Scanner;

public class StaticInitializer {

	static Scanner scanner=new Scanner(System.in);
	static int B=scanner.nextInt();
	static int H=scanner.nextInt();
	static boolean flag=B>0&&H>0?true:false;
	
	static{
		if(!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			
	}
	public static void main(String[] args) {
	
		if(flag)System.out.println(B*H);
	}

}
