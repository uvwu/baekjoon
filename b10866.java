package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "back":
                    if (d.isEmpty())
                        System.out.println(-1);
                    else System.out.println(d.getLast());
                    break;
                case "front":
                    if (d.isEmpty())
                        System.out.println(-1);
                    else System.out.println(d.getFirst());
                    break;
                case "pop_back":
                    if (d.isEmpty())
                        System.out.println(-1);
                    else System.out.println(d.removeLast());
                    break;
                case "push_back":
                    d.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    d.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "size":
                    System.out.println(d.size());
                    break;
                case "empty":
                    if (d.isEmpty())
                        System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop_front":
                    if (d.isEmpty())
                        System.out.println(-1);
                    else System.out.println(d.removeFirst());
                    break;
            }
        }
    }
}

