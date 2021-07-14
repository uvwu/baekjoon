package baekjoon;

import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String num=s.next(); int sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}
