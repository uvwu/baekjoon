package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Deque<Integer> s=new LinkedList<>();
        int last=0;
        for(int i=0;i<n;i++)
            s.add(n-i);
        if(n==1)
            System.out.println(1);
        else {
            while (true) {
                s.removeLast();
                if (s.size() == 1)
                    break;
                s.addFirst(s.removeLast());
            }
            System.out.println(s.pop());
        }
    }
}
