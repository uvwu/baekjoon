#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[1001];
    a[0]=1,a[1]=1;
    for(int i=2;i<1001;i++){
        a[i]=(a[i-1]+a[i-2])%10007;
    }
    printf("%d\n",a[n]);
}