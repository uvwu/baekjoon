package baekjoon;

import java.util.Scanner;

public class b15650 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] array=new int[n];
        int[] answer=new int[m];
        for(int i=0;i<n;i++) {
            array[i]=i+1;
        }
        for(int i=0;i<n;i++){
            answer[i]=array[i];
        }
    }
}
