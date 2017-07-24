package geek;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vagrant on 19/07/17.
 */
public class Formatting {
    public static void main(String[] args) {
        DecimalFormat ft = new DecimalFormat("####");
        ft = new DecimalFormat("000");
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-10s", s1)+""+ft.format(x));
        }
        System.out.println("================================");

    }
}
