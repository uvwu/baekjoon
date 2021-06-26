package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b2292 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt()-1;
        int i=1;
        while(true){
            if(n<1)
                break;
            n-=6*i;
            i++;
        }
        System.out.println(i);
    }
}
