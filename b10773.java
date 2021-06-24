package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b10773 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            int e=s.nextInt();
            if(e==0)
                st.pop();
            else
                st.add(e);
        }
        int sum=0;
        while(!st.isEmpty())
            sum+=st.pop();
        System.out.println(sum);
    }
}
