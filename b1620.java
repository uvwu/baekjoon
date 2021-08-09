package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b1620 {
    public static void main(String[] args) throws IOException {
        Map<String,String> hm=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String s=br.readLine();
            hm.put(Integer.toString(i+1),s);
            hm.put(s,Integer.toString(i+1));
        }
        for(int i=0;i<m;i++){
            System.out.println(hm.get(br.readLine()));
        }
    }
}
