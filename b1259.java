package baekjoon;

import java.util.Scanner;

public class b1259 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            int n=s.nextInt();
            if(n==0)
                break;
            else {
                boolean b=false;
                if(n<10)
                    b=true;
                else if(n<100){
                    if(n/10==n%10)
                        b=true;
                }
                else if(n<1000){
                    if(n/100==n%10)
                        b=true;
                }
                else if(n<10000){
                    if(n/1000==n%10 && n/100%10==n/10%10)
                        b=true;
                }
                else {
                    if(n/10000==n%10 && n/1000%10==n/10%10)
                        b=true;
                }
                if(b)
                    System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
