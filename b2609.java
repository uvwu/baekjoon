package baekjoon;

import java.util.Scanner;

public class b2609 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(); int b=s.nextInt();
        if(b>a){
            int t=a;
            a=b;
            b=t;
        }
        int r=2;
        int m=1;
        while(r<=b){
            if( a%r==0 && b%r==0)
                m=r;
            r++;
        }
        System.out.println(m);
        System.out.println(a*b/m);
    }
}
