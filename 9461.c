#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    long long a[101];
    a[0]=1,a[1]=1,a[2]=1;
    for(int i=3;i<100;i++){
        a[i]=a[i-2]+a[i-3];
    }
    for(int i=0;i<t;i++){
        int n;
        scanf("%d",&n);
        printf("%lld\n",a[n-1]);
    }
}
