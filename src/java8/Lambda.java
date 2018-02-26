package java8;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>( Arrays.asList( "a", "d", "b" ));
       arrayList.forEach(e -> System.out.println( e ) );

       arrayList.forEach( ( String e ) -> System.out.println( e ) );

        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

        Arrays.asList("a", "b", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });


    }
}
