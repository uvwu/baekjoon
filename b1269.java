package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        HashSet<String> hs=new HashSet<>();
        st=new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            String s=st.nextToken();
            hs.add(s);
        }
        st=new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            String s=st.nextToken();
            if (hs.contains(s))
                hs.remove(s);
            else hs.add(s);}
        System.out.println(hs.size());
    }
}
