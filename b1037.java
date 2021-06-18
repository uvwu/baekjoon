package baekjoon;

import java.util.Scanner;

public class b1037 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int min=s.nextInt();
        int max=min;
        for(int i=1;i<n;i++){
            int t=s.nextInt();
            if(t>max)
                max=t;
            if(t<min)
                min=t;
        }
        System.out.println(min*max);
    }
}
