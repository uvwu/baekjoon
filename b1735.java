package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class b1735 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int a1=s.nextInt(); int a2=s.nextInt();
        int b1=s.nextInt(); int b2=s.nextInt();
        int gcd=gcd(Math.max(a2,b2),Math.min(a2,b2));
        int sum=a1*b2/gcd+b1*a2/gcd;
        int gcd2=gcd(Math.max(sum,a2*b2/gcd),Math.min(sum,a2*b2/gcd));
        System.out.println(sum/gcd2+" "+a2*b2/gcd/gcd2);
    }
    static int gcd(int a, int b){
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
