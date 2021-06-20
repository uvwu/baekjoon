package baekjoon;

import java.util.Scanner;

public class b17626 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[50001];
        for(int i=1;i<224;i++){
            for(int j=i;j<224;j++){
                for(int k=j;k<224;k++){
                    for(int l=k;l<224;l++){
                        if(i*i+j*j+k*k+l*l>50000)
                            break;
                        a[i*i+j*j+k*k+l*l]=4;
                    }
                }
            }
        }
        for(int i=1;i<224;i++){
            for(int j=i;j<224;j++){
                for(int k=j;k<224;k++){
                    if(i*i+j*j+k*k>50000)
                        break;
                    a[i*i+j*j+k*k]=3;
                }
            }
        }
        for (int i=1;i<224;i++){
            for(int j=i;j<224;j++){
                if(i*i+j*j>50000)
                    break;
                a[i*i+j*j]=2;
            }
        }
        for(int i=1;i<224;i++){
            a[i*i]=1;
        }
        System.out.println(a[n]);
    }
}
