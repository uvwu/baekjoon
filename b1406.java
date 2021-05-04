import java.sql.Array;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class b1406 {
    public static void main(String[] args) {
        int repeat;
        Stack<String> stack= new Stack<>();
        Scanner s=new Scanner(System.in);
        stack.push(s.next());
        repeat=s.nextInt();
        for(int i=0;i<repeat;i++){
            String input=s.next();
            String input1;
            if(input.equals("P")){
                input1=s.next();
                stack.push(input1);
            }
        }
        System.out.print(stack.pop());
    }
}
