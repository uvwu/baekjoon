package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        HashMap<Integer,Integer> hm=new HashMap<>();
        while (st.hasMoreTokens()){
            int i=Integer.parseInt(st.nextToken());
            if(hm.containsKey(i))
                hm.replace(i,hm.get(i)+1);
            else hm.put(i,1);
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            int id=Integer.parseInt(st.nextToken());
            if(hm.containsKey(id))
                sb.append(hm.get(id)+" ");
            else sb.append(0+" ");
        }
        System.out.println(sb);

    }
}
