#include<stdio.h>
int main(){
    int n,a=1,b=0,tem;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        tem=b;
        b+=a;
        a=0;
        a=tem;
    }
    printf("%d %d",a,b);
    return 0;
}