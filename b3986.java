package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int num=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            stack.clear();
            int a=0,b=0;
            String s= br.readLine();
            stack.add(s.charAt(0));
            for(int j=1;j<s.length();j++){
                if(stack.isEmpty() || s.charAt(j)!=stack.peek()){
                    stack.add(s.charAt(j));
                }
                else if(s.charAt(j)==stack.peek())
                    stack.pop();
            }

            if(stack.isEmpty())
                num++;
        }
        System.out.println(num);
    }
}
