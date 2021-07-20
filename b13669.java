package baekjoon;

import java.util.Scanner;

public class b13669 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] a=new long[36];
        a[0]=1;
        for(int i=1;i<36;i++){
            int j=0;
            while (j<i){
                a[i]+=a[j]*a[i-j-1];
                j++;
            }
        }
        System.out.println(a[n]);
    }
}
