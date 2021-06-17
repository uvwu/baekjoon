package baekjoon;

import java.util.Scanner;

public class b1929 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] number=new int[n+1][2];
        for(int i=0;i<n+1;i++){
            number[i][0]=i;
        }//2는 소수아님
        for (int i=2;i<n+1;i++){
            if(number[i][1]==2)
                continue;
            int num=2;
            while (i*num<n+1){
                number[i*num][1]=2;
                num++;
            }
        }
        number[1][1]=2;
        for(int i=m;i<n+1;i++){
            if(number[i][1]==0)
                System.out.println(number[i][0]);
        }

    }
}
