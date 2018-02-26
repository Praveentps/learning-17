package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n = Integer.parseInt(bf.readLine());
        System.out.println("Enter a k value");
        int k = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];
        System.out.println("Enter a elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println("checking ...");
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == k) {
                count++;
            }
        }
        System.out.println(n);
        System.out.println(k);
        System.out.println(count);
    }
}
