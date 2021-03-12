#include<stdio.h>
void f(int a);
int main(){
    int n,m;
    scanf("%d %d",&n,&m);
    for(int i=n;i<m+1;i++)
        f(i);
    return 0;
}
void f(int a){
    int i=0,t=a;
    while(t>0){
        if(a%t==0)
            i++;
        t--;
    }
    if(i==2)
        printf("%d\n",a);
    return;
}