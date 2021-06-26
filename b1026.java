package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b1026 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n;i++)
            b[i]=s.nextInt();
        Arrays.sort(a); Arrays.sort(b);
        int answer=0;
        for(int i=0;i<n;i++){
            answer+=a[i]*b[n-i-1];
        }
        System.out.println(answer);
    }
}
