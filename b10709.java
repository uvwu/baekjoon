package baekjoon;

import java.util.Scanner;

public class b10709 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt(); int w=s.nextInt();
        int[][] map=new int[h][w];

        for(int i=0;i<h;i++){
            String m=s.next();
            for(int j=0;j<w;j++){
                map[i][j]=-1;
                if('c' == m.charAt(j))
                    map[i][j]=0;
                else{
                    if(j!=0 && map[i][j-1]>-1)
                        map[i][j]=map[i][j-1]+1;
                }
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++)
                System.out.print(map[i][j]+" ");
            System.out.println();
        }
    }
}
