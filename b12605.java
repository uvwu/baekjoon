package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<String> stack=new Stack<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            while (st.hasMoreTokens()){
                stack.add(st.nextToken());
            }
            System.out.print("Case #"+(i+1)+":");
            while (!stack.isEmpty()){
                System.out.print(" "+stack.pop());
            }
            System.out.println();
        }
    }
}
