package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken()); int m=Integer.parseInt(st.nextToken());
        HashMap<String,String> hm=new HashMap<String,String>();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            String key=st.nextToken(); String value=st.nextToken();
            hm.put(key,value);
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<m;i++){
            bw.write(hm.get(br.readLine())+'\n');
        }
        bw.flush();
    }
}
