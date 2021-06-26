package baekjoon;

import java.util.Scanner;

public class b1476 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int e=s.nextInt();
        if(e==15)
            e=0;
        int ss=s.nextInt();
        if(ss==28)
            ss=0;
        int m=s.nextInt();
        if(m==19)
            m=0;
        int a=1;
        while (true){
            if(a%15==e &&a%28==ss && a%19==m)
                break;
            a++;
        }
        System.out.println(a);
    }
}
