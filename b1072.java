package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        long x=Integer.parseInt(st.nextToken());
        long y=Integer.parseInt(st.nextToken());
        long z=y*100/x;
        if(z>98)
            System.out.println(-1);
        else {
            long init = 0;
            long end =Integer.MAX_VALUE;
            while (init<=end){
                long mid=(init+end)/2;
                long zz=(y+mid)*100/(x+mid);
                if(zz>z)
                    end=mid-1;
                else //zz=<z
                    init=mid+1;
            }
            System.out.println(end+1);
        }
    }
}
