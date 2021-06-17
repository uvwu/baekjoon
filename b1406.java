package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack1= new Stack<>();// 처음 입력
        Stack<Character> stack2= new Stack<>();

        String str = br.readLine();
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < str.length(); i++)
            stack1.push(str.charAt(i));

        for (int i = 0; i < repeat; i++) {
            String input = br.readLine();

            if (input.charAt(0) == 'P') {
                stack1.push(input.charAt(2));
            } else if (input.charAt(0) == 'L') {
                if (stack1.empty())
                    continue;
                stack2.push(stack1.pop());
            } else if (input.charAt(0) == 'D') {
                if (stack2.empty())
                    continue;
                stack1.push(stack2.pop());
            } else {// intput=="B"
                if (stack1.empty())
                    continue;
                stack1.pop();
            }

        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.empty()) {
            sb.append(stack2.pop());
        }

        System.out.println(sb);
    }
}
