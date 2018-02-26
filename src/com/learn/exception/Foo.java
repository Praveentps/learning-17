package com.learn.exception;

public class Foo 
{  
    public static void main(String[] args) 
    {
        try
        {
            //System.exit(0);
            return;
        } 
        finally 
        {
            System.out.println( "Finally" ); 
        }
     }
}