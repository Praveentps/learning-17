package com.learn.gc;


public class Rabbit {

    /*protected void finalize(){
        System.out.println("hi");
    }*/

    public static void main(String[] args) {
        Rabbit one = new Rabbit();
        Rabbit two = new Rabbit();
        Rabbit three = one;
        one = null;
        Rabbit four = one;
        three = null;
        two = null;
        two = new Rabbit();
        System.gc();
    }
}