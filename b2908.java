package baekjoon;

import java.util.Scanner;

public class b2908 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(); int b=s.nextInt();
        a=a/100+a%100/10*10+a%10*100; b=b/100+b%100/10*10+b%10*100;
        int max=a;
        if(b>a)
            max=b;
        System.out.println(max);
    }
}
