package baekjoon;

import java.util.Scanner;

public class b15624 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[1000001];
        a[0]=0;a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i]=(a[i-2]+a[i-1])%1000000007;
        }
        System.out.println(a[n]);
    }
}
