package baekjoon;

import java.util.Scanner;

public class b11721 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.next();
        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));
            if(i%10==9)
                System.out.println();
        }
    }
}
