package interview.walmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LargestNumberFromString {
     static String max;
    public static void main(String[] args) throws IOException {
//        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//        String str=bf.readLine();
//        System.out.println(str.charAt(0));
        String str1 = "129814999";

        int k = 4;

        max = str1;
        System.out.println(findMaximumNum(str1, k));
        System.out.println(max);

    }

    static int  findMaximumNum(String str, int k) {
        // return if no swaps left
        if (k == 0)
            return Integer.parseInt(max);

        int n = str.length();

        // consider every digit
        for (int i = 0; i < n - 1; i++) {

            // and compare it with all digits after it
            for (int j = i + 1; j < n; j++) {
                // if digit at position i is less than digit
                // at position j, swap it and check for maximum
                // number so far and recurse for remaining swaps
                if (str.charAt(i) < str.charAt(j)) {
                    // swap str[i] with str[j]
                    swap(str.charAt(i), str.charAt(j));

                    // If current num is more than maximum so far
                    if (Integer.parseInt(max) > Integer.parseInt(str))
                        max = str;

                    // recurse of the other k - 1 swaps
                    findMaximumNum(str, k - 1);

                    // backtrack
                    swap(str.charAt(i), str.charAt(j));
                }
            }
        }
        return Integer.parseInt(max);
    }

    static private void swap(char c, char c1) {
    if(c<c1){
        char tmp=c;
        c=c1;
        c1=tmp;
    }
    }


}
