package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        arr[0]=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==1)
                System.out.println(arr[b-1]);
            else System.out.println(arr[b-1]-arr[a-2]);
        }
    }
}
