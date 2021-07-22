package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        double[] a=new double[n];
        double[] m=new double[n];
        for(int i=0;i<n;i++){
            a[i]=Double.parseDouble(br.readLine());
        }
        m[0]=a[0];
        double max=a[0];
        for(int i=1;i<n;i++){
            m[i]=Math.max(m[i-1]*a[i],a[i]);
            max=Math.max(m[i],max);
        }
        System.out.printf("%.3f",max);
    }
}
