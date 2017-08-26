package com.learn.datatype;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-(Byte.MAX_VALUE+1) && x<=Byte.MAX_VALUE)System.out.println("* byte\n* short\n* int\n* long");
                else if(x>=-(Short.MAX_VALUE+1) && x<=Short.MAX_VALUE)System.out.println("* short\n* int\n* long");
                else if(x>=-(Integer.MAX_VALUE+1) && x<=Integer.MAX_VALUE)System.out.println("* int\n* long");
                else if(x>=-(Long.MAX_VALUE+1) && x<= Long.MAX_VALUE)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
