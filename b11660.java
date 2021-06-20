package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[][] a=new int[n][n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            s= br.readLine();
            st=new StringTokenizer(s);
            a[i][0]=Integer.parseInt(st.nextToken());
            for(int j=1;j<n;j++){
                a[i][j]=a[i][j-1]+Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<m;i++){
            s= br.readLine();
            st=new StringTokenizer(s);
            int x1=Integer.parseInt(st.nextToken())-1; int y1=Integer.parseInt(st.nextToken())-1;
            int x2=Integer.parseInt(st.nextToken())-1; int y2=Integer.parseInt(st.nextToken())-1;
            int sum=0;
            for(int j=x1;j<x2+1;j++){
                if(y1==0)
                    sum+=a[j][y2];
                else
                    sum+=a[j][y2]-a[j][y1-1];
            }
            b[i]=sum;
        }
        for(int i=0;i<m;i++)
            System.out.println(b[i]);
    }
}
