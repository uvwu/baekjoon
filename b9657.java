package baekjoon;

import java.util.Scanner;

public class b9657 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[1001];
        a[1]=1; a[2]=0; a[3]=1; a[4]=1;
        for(int i=5;i<1001;i++){
            if(a[i-1]*a[i-3]*a[i-4]==0)
                a[i]=1;
            else
                a[i]=0;
        }
        if(a[n]==1)
            System.out.println("SK");
        else System.out.println("CY");
    }
}
