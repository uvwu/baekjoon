package baekjoon;

import java.util.Scanner;

public class b9659 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        if(n%2==0)
            System.out.println("CY");
        else System.out.println("SK");
    }
}
