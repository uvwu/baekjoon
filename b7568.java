package baekjoon;

import java.util.Scanner;

public class b7568 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int repeat=s.nextInt();
        int[][] a=new int[repeat][3];
        for(int i=0;i<repeat;i++){
            a[i][0]=s.nextInt();
            a[i][1]=s.nextInt();
        }
        for(int i=0;i<repeat;i++) {
            for (int j = 0; j < repeat - i; j++) {
                if (a[i][0] > a[i+j][0] && a[i][1] > a[i+j][1])
                    a[i+j][2]++;
                if (a[i+j][0] > a[i][0] && a[i+j][1] > a[i][1])
                    a[i][2]++;
            }
        }
        for(int i=0;i<repeat;i++){
            System.out.print(a[i][2]+1+" ");
        }
    }
}
