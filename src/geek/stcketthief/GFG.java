package geek.stcketthief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vagrant on 15/07/17.
 */
public class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int t = Integer.parseInt(bufferedReader.readLine());
        String[] lines = new String[t];
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(bufferedReader.readLine());
            lines[i] = bufferedReader.readLine();

        }
        for (int j = 0; j < t; j++) {
            String[] numbers = lines[j].split(" ");
            int sumOfEven = 0, sumOfOdd = 0;
            for (int i = 0; i < numbers.length - 1; i = i + 2) {
                sumOfEven += Integer.parseInt(numbers[i]);
                sumOfOdd += Integer.parseInt(numbers[i + 1]);
            }
            System.out.println(sumOfEven > sumOfOdd ? sumOfEven : sumOfOdd);
        }
    }
}
