#include<stdio.h>
int main(){
    int n,an,f1=0,f2=1;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        an=(f1+f2)%10;
        f1=f2;
        f2=an;
    }
    printf("%d",an);
}