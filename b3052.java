package baekjoon;

import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[42];
        for(int i=0;i<10;i++){
            a[s.nextInt()%42]=1;
        }
        int sum=0;
        for(int k:a){
            if(k==1)
                sum++;
        }
        System.out.println(sum);
    }
}
