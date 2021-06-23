package baekjoon;

import java.util.Scanner;

public class b2884 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(); int m=s.nextInt();
        m+=15;
        if(m>=60)
            t++;
        m%=60;
        t=(t+23)%24;
        System.out.println(t+" "+m);
    }
}
