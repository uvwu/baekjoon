package baekjoon;

import java.util.Scanner;

public class b9658 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[1001];//-1 CY승, 1 SK승
        a[1] = -1;
        a[2] = 1;
        a[3] = -1;
        a[4] = 1;
        for (int i = 5; i < 1001; i++) {
            if(a[i-1]==-1 || a[i-3]==-1 || a[i-4]==-1)
                a[i]=1;
            else a[i]=-1;
        }

        int n = s.nextInt();
        if (a[n] == 1)
            System.out.println("SK");
        else System.out.println("CY");

    }
}
