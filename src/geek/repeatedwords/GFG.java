package geek.repeatedwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class GFG {
    public static void main(String[] args) throws IOException {

        int n;
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bufferedReader.readLine());
        String[] lines=new String[t];
        for (int i=0;i<t;i++){
            n=Integer.parseInt(bufferedReader.readLine());
            lines[i]=bufferedReader.readLine();
        }

        for(int i=0;i<t;i++){
            String[] str=lines[i].split(" ");
            int occurrences=0;
            Map<String,Integer> map=new HashMap<>();
            for(int j=0;j<str.length;j++){
                int count=1;
                String key=str[j];
                if(!map.containsKey(key)){
                for(int k=0;k<str.length;k++){
                    if(j!=k&&key.equals(str[k])){
                      count++;
                    }
                }
                if(count==2){
                 map.put(key,count);
                 occurrences++;
                }
                }
            }
            System.out.println(occurrences);
        }
    }
}
