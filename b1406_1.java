package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b1406_1 {
    public static void main(String[] args) throws IOException{
        Stack<String> stackm= new Stack<>();//메인스택
        Stack<String> stacks= new Stack<>();//서브스택

        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str =new StringTokenizer(bf.readLine());
        int repeat = Integer.parseInt(bf.readLine());

        while(str.hasMoreTokens()) {
            stackm.push(str.nextToken());
        }

        for(int i=0;i<repeat;i++) {
            String input = bf.readLine();
            if (input.equals("P")) {
                String input1 = bf.readLine();
                stackm.push(input1);
            }
            else if (input.equals("L")) {
                if (stackm.empty())
                    continue;
                stacks.push(stackm.pop());
            }
            else if (input.equals("D")) {
                if (stacks.empty())
                    continue;
                stackm.push(stacks.pop());
            }
            else {// intput=="B"
                if (stackm.empty())
                    continue;
                stackm.pop();
            }
        }
        while(!stackm.empty()){
            stacks.push(stackm.pop());
        }
        while(!stacks.empty()) {
            System.out.print(stacks.pop());
        }
    }
}
