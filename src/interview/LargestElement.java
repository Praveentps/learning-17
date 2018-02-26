package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Given an array of elements , find the next greater element for every elements
* */
public class LargestElement {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number of elements ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = bf.read();
            bf.readLine();
        }
        bf.close();

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }

        if (n < 1) {
            System.out.println("no elements found");
        } else {


            int[] largest = new int[n];
            for (int i = 0; i < n; i++) {
                int j = i + 1;
                int key = array[i];
                boolean found = false;
                try {
                    do {

                        if (key <= array[j]) {
                            key = array[j];
                            largest[i] = key;
                            found = true;

                        }
                        j++;

                    } while (j < n);
                    if (!found) {
                        largest[i] = -1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    largest[i] = -1;
                }
            }

            System.out.println("largest elements");
            for (int i = 0; i < n; i++) {
                System.out.print(" " + largest[i]);
            }
        }

    }
}
