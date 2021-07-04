package baekjoon;

import java.util.Scanner;

public class b10610 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.next();
        int[] a={0,0,0,0,0,0,0,0,0,0};
        int sum=0;
        for(int i=0;i<num.length();i++){
            a[num.charAt(i)-'0']++;
            sum+=num.charAt(i);
        }
        if(a[0]==0)
            System.out.println("-1");
        else if(sum%3!=0){
            System.out.println("-1");
        }
        else{
            for(int i=9;i>-1;i--){
                if(a[i]>0){
                    for(int j=0;j<a[i];j++){
                        System.out.print(i);
                    }
                }
            }
        }
    }
}
