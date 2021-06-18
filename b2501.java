package baekjoon;

import java.util.Scanner;

public class b2501 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] a=new int[n];
        int num=0;
        for (int i=1;i<n+1;i++){
            if(n%i==0)
                a[i-1]=i;
        }
        for (int i=0;i<n;i++){
            if(a[i]!=0)
                num++;
            if(num==k) {
                System.out.println(a[i]);
                break;
            }
        }
        if(num<k)
            System.out.println(0);
    }
}
