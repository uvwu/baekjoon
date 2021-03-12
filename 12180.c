#include<stdio.h>
int main(){
    int t;
    int a[10][10]={0};
    for(int i=0;i<10;i++){
        a[0][i]=1;
        a[i][0]=1;}
    for(int i=1;i<10;i++){
        for(int j=1;j<10;j++){
            a[i][j]=a[i][j-1]+(i-1)*j+1;
        }
    }
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        int r,c;
        scanf("%d %d",&r,&c);
        printf("Case #%d: %d\n",i+1,a[r-1][c-1]);
    }
    return 0;
}