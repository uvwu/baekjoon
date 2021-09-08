package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        int init=0;
        int end=1000000000;
        int x;
        while (true){
            int mid=(init+end)/2;
            long sum=sum(mid,a);
            if(sum==m){
                x=mid;
                break;
            }
            else if(sum<m){
                end=mid-1;
            }
            else {//sum>m
                if(sum(mid+1,a)<m) {
                    x = mid;
                    break;
                }
                else init=mid+1;
            }
        }
        System.out.println(x);

    }
    static long sum(int j,int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]-j>0)
                sum+=a[i]-j;
        }
        return sum;
    }
}
