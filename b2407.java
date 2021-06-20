package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class b2407 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        BigInteger[][] a=new BigInteger[n+1][n+1];
        for(int i=0;i<n+1;i++){
            a[i][0]=new BigInteger(String.valueOf(1)); a[i][i]=new BigInteger(String.valueOf(1));
        }
        for(int i=2;i<n+1;i++){
            for(int j=1;j<i;j++)
                a[i][j]=new BigInteger(String.valueOf(a[i-1][j-1].add(a[i-1][j])));
        }
        System.out.println(a[n][m].toString());
    }
}