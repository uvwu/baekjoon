package baekjoon;

import java.util.Scanner;

public class b2960 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a = 1;
        int[][] array = new int[n + 1][2];
        for (int i = 0; i < n + 1; i++)
            array[i][0] = i;
        //체
        for (int i = 2; i < n + 1; i++) {
            int num = 1;
            while (i * num < n + 1) {
                if(array[i*num][1]==0) {
                    array[i * num][1] = a;
                    a++;
                }
                num++;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (array[i][1] == k) {
                System.out.println(array[i][0]);
                break;
            }
        }
    }
}