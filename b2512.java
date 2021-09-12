package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        long sum1=0;
        int amax=0;
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
            sum1+=a[i];
            if(a[i]>amax)
                amax=a[i];
        }
        int m=Integer.parseInt(br.readLine());

        int init=0;
        int end= 1_000_000_000;
        while (end>=init){
            int mid=(init+end)/2;
            long sum=0;
            for(int j:a){
                if(j>=mid)
                    sum+=mid;
                else sum+=j;
            }
            if(m>=sum)
                init=mid+1;
            else end=mid-1;
        }

        if(m>=sum1)
            System.out.println(amax);

        else System.out.println(end);
    }
}
