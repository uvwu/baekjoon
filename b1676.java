package baekjoon;

import java.util.Scanner;

public class b1676 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int answer=0;

        if(n<25)
            answer+=n/5;
        else if(n<125){
            answer+=n/5;
            answer+=n/25;
        }
        else{
            answer+=n/5;
            answer+=n/25;
            answer+=n/125;
        }
        System.out.println(answer);
    }
}
