package baekjoon;

import java.util.Scanner;

public class b17175 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[51];
        a[0]=a[1]=1;
        for(int i=2;i<51;i++){
            a[i]=(a[i-1]+a[i-2]+1)%1000_000_007;
        }
        System.out.println(a[n]);
    }
}
