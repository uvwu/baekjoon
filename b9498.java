package baekjoon;

import java.util.Scanner;

public class b9498 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=60){
            if(n>=70){
                if(n>=80){
                    if(n>=90){
                        System.out.println("A");
                    }
                    else System.out.println("B");
                }
                else System.out.println("C");
            }
            else System.out.println("D");
        }
        else System.out.println("F");
    }
}
