package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            HashSet<Integer> hs=new HashSet<>();
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            while (st.hasMoreTokens())
                hs.add(Integer.parseInt(st.nextToken()));
            int m=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine()," ");
            StringBuilder sb=new StringBuilder();
            while (st.hasMoreTokens()){
                if(hs.contains(Integer.parseInt(st.nextToken())))
                    sb.append(1+"\n");
                else sb.append(0+"\n");
            }
            System.out.print(sb);
        }
    }
}
