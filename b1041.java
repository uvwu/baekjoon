package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b1041 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        int[] a=new int[6];
        for(int i=0;i<6;i++){
            a[i]=s.nextInt();
        }
        int a1=a[0];
        for(int i=1;i<6;i++){
            if(a1>a[i])
                a1=a[i];
        }
        int a3 = a[0] + a[1] + a[2];
        int a2 = a[0] + a[1];
        for(int i=0;i<6;i++) {
            for (int j = i+1; j < 6; j++){
                if((i==0 && j==5) ||(i==1&&j==4)||(i==2&&j==3))
                    continue;
                else {
                    if(a2>a[i]+a[j])
                        a2=a[i]+a[j];
                }
            }
        }
        if(a3>a[0]+a[2]+a[4])
            a3=a[0]+a[2]+a[4];
        if(a3>a[0]+a[1]+a[3])
            a3=a[0]+a[1]+a[3];
        if(a3>a[0]+a[3]+a[4])
            a3=a[0]+a[3]+a[4];
        if(a3>a[5]+a[1]+a[2])
            a3=a[5]+a[1]+a[2];
        if(a3>a[5]+a[2]+a[4])
            a3=a[5]+a[2]+a[4];
        if(a3>a[5]+a[1]+a[3])
            a3=a[5]+a[1]+a[3];
        if(a3>a[5]+a[3]+a[4])
            a3=a[5]+a[3]+a[4];

        if(n==1) {
            Arrays.sort(a);
            System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);
        }
        else if(n==2)
            System.out.println(a3*4+a2*4);
        else {
            long sum = 0L;
            long k=n-2;
            sum = sum + a3 * 4L + a2 * 4L;
            sum = sum + a2*k*8L+a1*k*k*5L+a1*k*4L;
            System.out.println(sum);
        }
    }
}
