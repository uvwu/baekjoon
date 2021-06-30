package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Queue<Integer> queue=new ArrayDeque<>();
        int last=0;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            String order=st.nextToken();
            switch (order) {
                case "back":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else System.out.println(last);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "push":
                    last=Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "front":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else System.out.println(queue.peek());
                    break;
                case "empty":
                    if (queue.isEmpty())
                        System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else System.out.println(queue.poll());
                    break;
            }

        }
    }
}
