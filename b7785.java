package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class b7785 {
    public static void main(String[] args) throws IOException {
        TreeSet<String> hs=new TreeSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            String name=st.nextToken(); String input=st.nextToken();
            if(input.equals("enter")){
                hs.add(name);
            }
            else if(input.equals("leave")){
                hs.remove(name);
            }
        }
        StringBuilder sb=new StringBuilder();
        List<String> l=new ArrayList<>(hs);
        Collections.sort(l,Collections.reverseOrder());
        for(String s:l){
            sb.append(s+"\n");
        }
        System.out.println(sb);
    }
}
