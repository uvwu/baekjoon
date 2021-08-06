package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10211 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int len=Integer.parseInt(br.readLine());
            int[] a=new int[len];
            int[] b=new int[len];
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int max=b[0]=a[0]=Integer.parseInt(st.nextToken());

            for(int j=1;j<len;j++){
                a[j]=Integer.parseInt(st.nextToken());
                b[j]=Math.max(b[j-1]+a[j],a[j]);
                max=Math.max(max,b[j]);
            }
            System.out.println(max);
        }
    }
}
