package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b1406 {
    public static void main(String[] args) {
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2= new Stack<>();

        Scanner s=new Scanner(System.in);
        String str=s.next();
        int repeat=s.nextInt();
        for(int i=0;i<str.length();i++){
            stack1.push(str.charAt(i));
        }

        for(int i=0;i<repeat;i++){
            String input=s.next();
            if(input.equals("P")){
                String input1;
                input1=s.next();
                stack1.push(input1.charAt(0));
            }
            else if(input.equals("L")){
                if(stack1.empty())
                    continue;
                stack2.push(stack1.pop());

            }
            else if(input.equals("D")){
                if(stack2.empty())
                    continue;
                stack1.push(stack2.pop());
            }
            else{// intput=="B"
                if(stack1.empty())
                    continue;
                stack1.pop();
            }

        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.empty()) {
            System.out.print(stack2.pop());
        }
    }
}
