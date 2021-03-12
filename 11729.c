#include<stdio.h>
int num=0;
void h(int a,int s,int e);
int main(){
    int n,t=1,a;
    scanf("%d",&n);
    a=n;
    while(a>0){
        t*=2;
        a--;
    }
    printf("%d\n",t-1);
    h(n,1,3);
}
void h(int a,int s,int e){
    if(a==1){
        printf("%d %d\n",s,e);
        num++;
        return;
    }
    else{
        h(a-1,s,6-s-e);
        printf("%d %d\n",s,e);
        num++;
        h(a-1,6-s-e,e);}
}