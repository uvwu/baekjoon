package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b9012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] y=new String[n];
        for(int i=0;i<n;i++){
            Stack<String> stack=new Stack<>();
            String v=s.next();
            boolean b=true;
            for(int j=0;j<v.length();j++){
                if(v.charAt(j)=='(')
                    stack.push("(");
                else if(v.charAt(j)==')') {
                    if(stack.isEmpty()){
                        b=false;
                        break;
                    }
                    else stack.pop();
                }
            }
            if(!stack.isEmpty())
                b=false;
            if(b)
                y[i]="YES";
            else y[i]="NO";
        }
        for (String k:y)
            System.out.println(k);
    }
}
