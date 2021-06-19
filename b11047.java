package baekjoon;

import java.util.Scanner;

public class b11047 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++)
            c[i]=s.nextInt();
        int num=0;

        for (int i=n-1;i>-1;i--){
            if(p/c[i]>0){
                num+=p/c[i];
                p-=p/c[i]*c[i];
            }
        }
        System.out.println(num);
    }
}
