package interview.GE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sort {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());

        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }

        LinkedHashMap<Integer ,Integer> map=new LinkedHashMap<>();

        for (int i=0;i<size;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
        }
        //TreeMap treeMap=new TreeMap(map);

        System.out.println(map);
        //System.out.println(treeMap);
    }
}
