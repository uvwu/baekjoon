package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int k=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int[] a=new int[k];
        for(int i=0;i<k;i++)
            a[i]=Integer.parseInt(br.readLine());
        long init=1;
        long end=Integer.MAX_VALUE;
        while (end>=init){
            long mid=(init+end)/2;
            long cal = 0;
            for (int j : a) cal += j / mid;

            if(n<=cal) {
                init=mid+1;
            }

            else if(n>cal) {
                end = mid - 1;
            }

            else //n<cal
                init=mid+1;
        }
        System.out.println(end);
    }
}
