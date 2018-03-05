package interview.walmart;

import java.util.HashMap;
import java.util.Map;

public class Discussion {
    public static void main(String[] args) {
        dosomething();
        Map<Integer,Integer> map=new HashMap<>();
        System.out.println(map.get(1));
    }


    private static void dosomething() {

        try {
            // wait() method in java
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
