package baekjoon;

import java.util.Scanner;

public class b19947 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int y=s.nextInt();
        int[] a=new int[y+1];
        a[0]=h;
        for(int i=0;i<y;i++){
            if(i>=5)
                a[i]= (int) (a[i-5]*1.35);
        }


        System.out.println(h);
    }
}
