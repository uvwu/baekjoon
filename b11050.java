package baekjoon;

import java.util.Scanner;

public class b11050 {
    static int f(int x){
        if(x<1)
            return 1;
        return f(x-1)*x;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        System.out.println(f(n)/f(k)/f(n-k));
    }
}
