#include<stdio.h>
int main(){
    int a[30][30]={0};
    for(int i=0;i<30;i++){
        a[i][i]=1;
        a[i][0]=1;
    }
    for(int i=2;i<30;i++){
        for(int j=1;j<i+1;j++){
            a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
    }
    int r,c,w,an=0;
    scanf("%d %d %d",&r,&c,&w);
    an+=a[r-1][c-1];
    for(int i=0;i<w-1;i++){
        an+=a[r+w-1][c+i];
    }
    printf("%d\n",an);
}