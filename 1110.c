#include<stdio.h>
int main(){
    int n,t,num=0;
    scanf("%d",&n);
    t=n;
    do{
        int one=n%10;
        int ten=n/10;
        n=(one+ten)%10+10*one;
        num++;
    }while(n!=t);
    printf("%d\n",num);
}