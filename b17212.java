package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[100001];
        a[0]=0;a[1]=1;a[2]=1;a[5]=1;a[7]=1;
        for(int i=3;i<a.length;i++){
            a[i]=a[i-1]+1;
            a[i]=Math.min(a[i-2]+1,a[i]);
            if(i>4)
                a[i]=Math.min(a[i-5]+1,a[i]);
            if(i>6)
                a[i]=Math.min(a[i-7]+1,a[i]);
        }
        System.out.println(a[n]);
    }
}
