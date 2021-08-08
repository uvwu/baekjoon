package baekjoon;

import java.util.Scanner;

public class b1789 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long i=1;
        while (true){
            if(n<i*(i+1)/2)
                break;
            i++;
        }
        System.out.println(i-1);
    }
}
