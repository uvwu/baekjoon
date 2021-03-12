#include<stdio.h>
int f(int a);
int main(){
    int n;
    scanf("%d",&n);
    printf("%d\n",f(n));
    return 0;
}
int f(int a){
    for(int i=a/5;i>-1;i--){
        if((a-5*i)%3==0)
            return i+(a-5*i)/3;
    }
    return -1;
}