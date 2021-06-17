package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b2493 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<num;i++)
            stack.push(s.nextInt());
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            stack.pop();
        }
    }
}
