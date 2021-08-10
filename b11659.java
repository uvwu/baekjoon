package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine()," ");
        a[0]=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            a[i]=a[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int x=Integer.parseInt(st.nextToken()); int y=Integer.parseInt(st.nextToken());
            if(x==1)
                System.out.println(a[y-1]);
            else System.out.println(a[y-1]-a[x-2]);

        }
    }
}
