package baekjoon;

import java.util.Scanner;

public class b2490 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p;
        String[] a=new String[3];
        for(int i=0;i<3;i++) {
            int f=0,b=0;
            for (int j = 0; j < 4; j++) {
                p = s.nextInt();
                if(p==0)//배
                    b++;
                if(p==1)//등
                    f++;
            }
            if(f==4)
                a[i]= String.valueOf('E');
            else if(b==4)
                a[i]=String.valueOf('D');
            else if(f==3)
                a[i]= String.valueOf('A');
            else if(f==2)
                a[i]=String.valueOf('B');
            else
                a[i]=String.valueOf('C');
        }
        for(String k:a)
            System.out.println(k);
    }
}
