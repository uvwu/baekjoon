package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb=new StringBuilder();
        while (st.hasMoreTokens()){
            int a=Integer.parseInt(st.nextToken());
            if(a<x)
                sb.append(a+" ");
        }
        System.out.println(sb);
    }
}
