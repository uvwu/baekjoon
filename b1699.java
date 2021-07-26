package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[100001];
        for(int i=1;i<317;i++){
            for(int j=i;j<317;j++){
                for(int k=j;k<317;k++){
                    for(int l=k;l<317;l++){
                        if(i*i+j*j+k*k+l*l>100000)
                            break;
                        a[i*i+j*j+k*k+l*l]=4;
                    }
                }
            }
        }
        for(int i=1;i<317;i++){
            for(int j=i;j<317;j++){
                for(int k=j;k<317;k++){
                    if(i*i+j*j+k*k>100000)
                        break;
                    a[i*i+j*j+k*k]=3;
                }
            }
        }
        for (int i=1;i<317;i++){
            for(int j=i;j<317;j++){
                if(i*i+j*j>100000)
                    break;
                a[i*i+j*j]=2;
            }
        }
        for(int i=1;i<317;i++){
            a[i*i]=1;
        }
        System.out.println(a[n]);
    }
}
