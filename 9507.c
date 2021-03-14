#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    long long a[69];
    a[0]=0,a[1]=1,a[2]=1,a[3]=2;
    for(int i=4;i<69;i++){
        a[i]=a[i-1]+a[i-4]+a[i-2]+a[i-3];
    }
    for(int i=0;i<t;i++){
        int n;
        scanf("%d",&n);
        printf("%lld\n",a[n+1]);
    }
}
