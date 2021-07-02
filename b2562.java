package baekjoon;

import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[9];
        int index=-1;
        int max=-1;
        for(int i=0;i<9;i++){
            a[i]=s.nextInt();
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
