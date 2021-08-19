package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken()); int num=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=a[i];
        }
        int max=sum;
        for(int i=num;i<n;i++){
            sum+=a[i];
            sum-=a[i-num];
            if(sum>max)
                max=sum;
        }
        System.out.println(max);
    }
}
