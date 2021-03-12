#include<stdio.h>
int main(void){
    int n;
    long long a[81];
    a[0]=a[1]=1;
    for(int i=2;i<81;i++){
        a[i]=a[i-1]+a[i-2];
    }
    scanf("%d",&n);
    printf("%lld\n",2*(a[n-1]+a[n]));
}