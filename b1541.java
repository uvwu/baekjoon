package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-')
                q.add(s.charAt(i));
        }
        StringTokenizer st=new StringTokenizer(s,"-|+");
        int n=Integer.parseInt(st.nextToken());
        boolean plus=true;
        while (!q.isEmpty()){
            char c=q.remove();
            if (c=='-'){
             plus=false;
            }
            if(plus)
                n+=Integer.parseInt(st.nextToken());
            else {
                n-=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(n);
    }
}
