#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    int a[30][30];
    for(int i=0;i<30;i++){
        a[i][0]=1;
        a[i][i]=1;
    }
    for(int i=1;i<30;i++){
        for(int j=1;j<i;j++){
            a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
    }
    for(int i=0;i<t;i++){
        int n,m;
        scanf("%d %d",&n,&m);
        printf("%d\n",a[m][n]);
    }
    return 0;

}
