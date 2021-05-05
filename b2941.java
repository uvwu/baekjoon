package baekjoon;

import java.util.Scanner;

public class b2941 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int num=0;
        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            if(c1=='='||c1=='-')
                num++;
            if(c1=='j'&& (str.charAt(i-1)=='n'||str.charAt(i-1)=='l'))
                num++;
        }
        System.out.println(str.length()-num);
    }
}
