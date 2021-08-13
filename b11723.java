package baekjoon;

import java.io.*;
import java.util.*;

public class b11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int bit=0;
        StringBuilder sb = new StringBuilder();
        int num;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            String o=st.nextToken();
            switch (o) {
                case "add" -> {
                    num = Integer.parseInt(st.nextToken());
                    bit |= 1 << (num - 1);
                    break;
                }
                case "remove" -> {
                    num = Integer.parseInt(st.nextToken());
                    bit &= ~(1 << (num - 1));
                    break;
                }
                case "check" -> {
                    num = Integer.parseInt(st.nextToken());
                    sb.append((bit & (1 << (num - 1))) != 0 ? 1 : 0).append('\n');
                    break;
                }
                case "toggle" -> {
                    num = Integer.parseInt(st.nextToken());
                    bit ^= (1 << (num - 1));
                    break;
                }
                case "all" -> bit = (1 << 21) - 1;
                case "empty" -> bit = 0;
            }
        }
        System.out.println(sb);
    }
}
