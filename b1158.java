import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class b1158 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num=s.nextInt();
        int index=s.nextInt();
        Queue<String> queue=new LinkedList<>();
        for(int i=0;i<num;i++){
            queue.add(String.valueOf(i+1));
        }
        System.out.print("<");
        for(int i=0;i<num;i++){
            for(int j=0;j<index-1;j++){
                queue.add(queue.remove());
            }
            if(i==0)
                System.out.print(queue.peek());
            else
                System.out.print(", "+queue.peek());
            queue.remove();
        }
        System.out.print(">");
    }
}
