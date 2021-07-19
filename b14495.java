package baekjoon;

import java.util.Scanner;

public class b14495 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] a=new long[116];
        a[0]=1; a[1]=1; a[2]=1;
        for(int i=3;i<116;i++){
            a[i]=a[i-1]+a[i-3];
        }
        System.out.println(a[n-1]);
    }
}
