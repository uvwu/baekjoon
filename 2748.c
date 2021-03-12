#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    unsigned long long a[10002]={0};
    a[0]=0,a[1]=1;
    for(int i=2;i<10002;i++){
        a[i]=a[i-1]+a[i-2];
    }
    printf("%llud\n",a[n]);
    return 0;
}