package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class b11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqp=new PriorityQueue<>();
        PriorityQueue<Integer> pqm=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                if(pqm.isEmpty() && pqp.isEmpty())
                    System.out.println(0);
                else if(!pqm.isEmpty() && pqp.isEmpty())
                    System.out.println(pqm.remove());
                else if(pqm.isEmpty() && !pqp.isEmpty())
                    System.out.println(pqp.remove());
                else {
                    if(pqm.peek()*-1 <= pqp.peek()){
                        System.out.println(pqm.remove());
                    }
                    else System.out.println(pqp.remove());
                }
            }
            else if(num>0){
                pqp.add(num);
            }
            else if(num<0){pqm.add(num);}
        }
    }
}
