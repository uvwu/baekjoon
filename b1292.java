package baekjoon;

import java.util.Scanner;

public class b1292 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] ar=new int[1001];
        int index=0;
        for(int i=1;i<100;i++){
            for(int j=1;j<i+1;j++){
                if(index+j>1000)
                    break;
                ar[index+j]=i;
            }
            index+=i;
        }
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for(int i=a;i<b+1;i++){
            sum+=ar[i];
        }
        System.out.println(sum);
    }
}
