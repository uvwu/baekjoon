package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class b13241 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong(); long b=s.nextLong();
        long gcd=min(Math.max(a,b),Math.min(a,b));
        System.out.println((a/gcd)*b);

    }
    static long min(long a, long b){
        if(a%b==0)
            return b;
        else
            return min(b,a%b);
    }
}
