package baekjoon;

import java.util.Scanner;

public class b2231 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[1000001];
        for(int i=1000000;i>0;i--){
            int k=i+i/1000000+i/100000%10+i/10000%10+i/1000%10+i/100%10+i/10%10+i%10;
            if(k>1000000)
                continue;
            else
                a[k]=i;
        }
        System.out.println(a[n]);
    }
}
