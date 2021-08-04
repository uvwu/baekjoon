package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        for(int k=0;k<n;k++) {
            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stack2 = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String str=br.readLine();

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='<'){
                    if(!stack1.isEmpty()) {
                        stack2.add(stack1.pop());
                    }
                }
                else if(str.charAt(i)=='>'){
                    if(!stack2.isEmpty()) {
                        stack1.add(stack2.pop());
                    }
                }
                else if(str.charAt(i)=='-'){
                    if(!stack1.isEmpty())
                        stack1.pop();
                }
                else {
                    stack1.push(str.charAt(i));
                }
            }
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            while (!stack2.empty()) {
                sb.append(stack2.pop());
            }

            System.out.println(sb);
        }
    }
}
