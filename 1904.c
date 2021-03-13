#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    a[0]=1,a[1]=2;
    for(int i=2;i<n;i++){
        a[i]=(a[i-2]+a[i-1])%15746;
    }
    printf("%d\n",a[n-1]);
}