package baekjoon;

import java.util.Scanner;

public class b1065 {
    public static void main(String[] args) {
        int[] a=new int[1001];
        for(int i=1;i<100;i++){
            a[i]=i;
        }
        for(int i=100;i<1001;i++){
            if( (i/100) + (i%10) == 2*( (i/10)%10) )
                a[i]=a[i-1]+1;
            else
                a[i]=a[i-1];
        }
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(a[num]);
    }
}
