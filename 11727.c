#include<stdio.h>
int f(int a);
int main(){
    int n;
    scanf("%d",&n);
    int a[n+1];
    a[1]=a[0]=1;
    for(int i=2;i<n+1;i++){
        a[i]=(a[i-1]+a[i-2]*2)%10007;
    }
    printf("%d\n",a[n]);
}
