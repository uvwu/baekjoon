package baekjoon;

import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        Scanner s=new Scanner((System.in));
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
            System.out.println(">");
        if(a<b)
            System.out.println("<");
        if (a==b)
            System.out.println("==");
    }
}
