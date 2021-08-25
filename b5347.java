package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(Math.min(a,b)==0)
                System.out.println(0);

            else {
                int gcd = gcd(Math.max(a, b), Math.min(a, b));
                System.out.println(a / gcd*b);
            }
        }
    }
    static int gcd(int a, int b){
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
