#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    if((n==1)||(n==3))
        printf("%d",-1);
    else if(n%5==0)
        printf("%d",n/5);
    else if(n%5==1)
        printf("%d",n/5-1+3);
    else if(n%5==2)
        printf("%d",n/5+1);
    else if(n%5==3)
        printf("%d",n/5-1+4);
    else 
        printf("%d",n/5+2);
    return 0;
}