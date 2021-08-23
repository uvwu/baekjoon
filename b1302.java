package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<String,Integer> hm=new HashMap<>();
        String book=new String();
        for(int i=0;i<n;i++){
            book=br.readLine();
            if(hm.containsKey(book)){
                hm.replace(book,hm.get(book)+1);
            }
            else hm.put(book,1);
        }
        int max=0;
        for(String s:hm.keySet()){
            max=Math.max(max,hm.get(s));
        }
        List<String> l=new ArrayList<>(hm.keySet());
        Collections.sort(l);
        for(String s:l){
            if(hm.get(s)==max){
                System.out.println(s);
                break;
            }
        }




    }
}
