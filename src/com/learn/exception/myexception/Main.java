package com.learn.exception.myexception;

public class Main {
    public static void main(String[] args) throws MyException {
        test();
    }

    private static void test() throws MyException {
        try {
            throw new MyException();
        } finally {
            System.out.println("executing finally block");
        }
    }
}
