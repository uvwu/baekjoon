package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b2217 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            r[i]=s.nextInt();
        }
        Arrays.sort(r);
        int max=r[n-1];

        for(int i=0;i<n-1;i++){
            if(max<r[i]*(n-i))
                max=r[i]*(n-i);
        }
        System.out.println(max);
    }
}
