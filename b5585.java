package baekjoon;

import java.util.Scanner;

public class b5585 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=1000-s.nextInt();
        int[] c={500,100,50,10,5,1};
        int num=0;

        for (int i=0;i<6;i++){
            if(p/c[i]>0){
                num+=p/c[i];
                p-=p/c[i]*c[i];
            }
        }
        System.out.println(num);
    }
}
