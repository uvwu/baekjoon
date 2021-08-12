package baekjoon;

import java.io.*;
import java.util.*;

public class b1764 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken()); int m=Integer.parseInt(st.nextToken());
        HashSet hs=new HashSet<>();
        HashSet<String> hs1=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String s=br.readLine();
            if(hs.contains(s)){
                hs1.add(s);
            }
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> l=new ArrayList<>(hs1);
        bw.write(l.size()+"\n");
        Collections.sort(l);
        for(String s:l){
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
