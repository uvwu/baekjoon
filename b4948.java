package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b4948 {
    static int f(int x){
        int number=0;
        int[] array=new int[2*x+1];
        for(int i=0;i<x*2+1;i++){
            array[i]=i;
        }
        for(int i=2;i<2*x+1;i++){
            int index=2;
           while (i*index<=2*x){
               if(array[i*index]!=0){
                array[i*index]=0;
                if(i*index>x)
                    number++;
               }
               index++;
           }
        }
        return x-number;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        while(true){
            int a=s.nextInt();
            if (a==0)
                break;
            q.add(a);
        }
        for(int x:q){
            System.out.println(f(x));
        }
    }
}
