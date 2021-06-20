package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        BigInteger[] a=new BigInteger[10001];
        a[0]=new BigInteger("0");
        a[1]=new BigInteger("1");
        for(int i=2;i<10001;i++){
            a[i]=a[i-1].add(a[i-2]);
        }
        System.out.println(a[n].toString());
    }
}
