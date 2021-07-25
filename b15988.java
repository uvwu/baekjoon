package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int[] a=new int[1000001];
        a[0]=1;a[1]=2;a[2]=4;
        for(int i=3;i<1000001;i++){
            a[i]=((a[i-3]+a[i-2])%1000000009+a[i-1])%1000000009;
        }
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            System.out.println(a[n-1]);
        }
    }
}
