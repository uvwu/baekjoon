#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    int a[41],b[41];
    a[0]=1,b[0]=0,a[1]=0,b[1]=1;
    for(int i=2;i<41;i++){
        a[i]=a[i-1]+a[i-2];
        b[i]=b[i-1]+b[i-2];
    }
    for(int i=0;i<t;i++){
        int n;
        scanf("%d",&n);
        printf("%d %d\n",a[n],b[n]);
    }
}