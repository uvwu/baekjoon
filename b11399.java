package baekjoon;

import java.util.Scanner;

public class b11399 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++)
            p[i]=s.nextInt();

        int i, j;
        int big,first=0;
        int temp;
        for(i= p.length-1;i>0;i--){
            big=first;
            for(j=first+1;j<=first+i;j++) {
                if (p[big] < p[j])
                    big = j;
            }
            temp=p[first+i];
            p[first+i]=p[big];
            p[big]=temp;
        }
        int t=p[0];
        for(i=1;i<n;i++){
            p[i]=p[i-1]+p[i];
            t+=p[i];
        }
        System.out.println(t);
    }
}
