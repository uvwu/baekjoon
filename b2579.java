package baekjoon;

import java.util.Scanner;

public class b2579 {
    static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] a=new int[n][2];
        final int Max=1;
        final int index=0;
        for(int i=0;i<n;i++){
            a[i][index]=s.nextInt();
            if(i>1){
                if(i>2)
                    a[i][Max]=max(a[i-3][Max]+a[i-1][index],a[i-2][Max])+a[i][index];
                else{
                    a[i][Max]=max(a[i-2][index],a[i-1][index])+a[i][index];
                }
            }
            else if(i==1){
                a[i][Max]=a[i-1][Max]+a[i][index];
                ss=true;
            }
            else if(i==0) {
                a[i][Max] = a[i][index];
            }
        }
        System.out.println(a[n-1][Max]);
    }
}
