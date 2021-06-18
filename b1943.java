package baekjoon;

import java.util.Scanner;

public class b1943 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] answer=new int[t];
        for(int i=0;i<t;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int max=1;//최대공약수
            int end=0;
            while (end==0){
                int d=2;//약수 후보
                //약수 찾기
                while (true){
                    if(a%d==0 && b%d==0){
                        a/=d; b/=d; max*=d;
                        break;
                    }
                    if(d>a || d>b){
                        end++;
                        break;
                    }
                    d++;
                }

            }
            answer[i]=max*a*b;
        }
        for(int a:answer)
            System.out.println(a);
    }
}
