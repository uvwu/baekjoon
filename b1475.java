package baekjoon;

import java.util.Scanner;

public class b1475 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] set=new int[9];
        double sn=0;
        String n=s.next();
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='9' || n.charAt(i)=='6')
                sn+=0.5;
            else
                set[Integer.parseInt(String.valueOf(n.charAt(i)))]+=1;
        }
        sn=(int)(sn+0.5);
        int max= (int) sn;
        for (int j : set) {
            if (j > max)
                max = j;
        }
        System.out.println(max);
    }
}
