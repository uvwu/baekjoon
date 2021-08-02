package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack=new Stack<>();
        String s="";
        Boolean t;
        while (true){
            s= br.readLine();
            if(s.equals("."))
                break;
            stack.clear();
            t=true;
            for(int i=0;i<s.length();i++) {
                if ('(' == s.charAt(i) || s.charAt(i) == '[')
                    stack.add(String.valueOf(s.charAt(i)));
                else if (s.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    }
                    else {
                        t=false;
                        break;
                    }
                }
                else if (s.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    }
                    else {
                        t=false;
                        break;}
                }
            }
            if(stack.isEmpty() && t)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
}
