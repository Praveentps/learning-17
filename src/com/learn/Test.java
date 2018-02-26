package com.learn;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int n = Integer.parseInt(number);
        int[][] array = new int[n][3];
        int maximum = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            String line = sc.nextLine();
            String[] scores = line.split(" ");
            for (int j = 0; j < scores.length; j++) {
                int value = Integer.parseInt(scores[j]);
                max += value;
                array[i][j] = value;

            }
            if (i > 0 & max > maximum) {
                maximum = max;
            }
        }
        System.out.println(maximum);
    }
}
