package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class b11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                if(pq.isEmpty())
                    System.out.println(0);
                else System.out.println(pq.remove());
            }
            else {pq.add(num);}
        }
    }
}
