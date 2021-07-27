package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[][] a=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            a[i][0]=1; a[i][i]=1;
        }
        for(int i=2;i<n+1;i++){
            for(int j=1;j<i;j++){
                a[i][j]=(a[i-1][j]+a[i-1][j-1])%10007;
            }
        }
        System.out.println(a[n][k]);
    }
}
