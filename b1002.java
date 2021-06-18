package baekjoon;

import java.util.Scanner;

public class b1002 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] answer=new int [t];
            for(int i=0;i<t;i++) {
                int x1 = s.nextInt();
                int y1 = s.nextInt();
                int r1 = s.nextInt();
                int x2 = s.nextInt();
                int y2 = s.nextInt();
                int r2 = s.nextInt();
                int d1=x1-x2;
                int d2=y1-y2;
                if(d1==0&&d2==0&&r1==r2)
                    answer[i]=-1;
                else if(d1*d1+d2*d2>(r1+r2)*(r1+r2) || (r1-r2)*(r1-r2)>d1*d1+d2*d2)
                    answer[i]=0;
                else if(d1*d1+d2*d2==(r1+r2)*(r1+r2) || (r1-r2)*(r1-r2)==d1*d1+d2*d2)
                    answer[i]=1;
                else
                    answer[i]=2;
            }
            for(int a:answer)
                System.out.println(a);
    }
}
