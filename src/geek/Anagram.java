package geek;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vagrant on 19/07/17.
 */
public class Anagram {
    static boolean isAnagram(String a, String b) {

        if(a.length()==b.length()){
           a= a.toLowerCase();
           b= b.toLowerCase();
            int length=a.length();
            char[] atemp=new char[length];
            char[] btemp=new char[length];
            for(int i=0;i<length;i++){
                atemp[i]=a.charAt(i);
                btemp[i]=b.charAt(i);
            }
            Arrays.sort(atemp);
            Arrays.sort(btemp);
            String aa=String.valueOf(atemp);
            String bb=String.valueOf(btemp);
            if(aa.equals(bb)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
