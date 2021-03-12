#include<stdio.h>
int main(){
    int n,an=0;
    scanf("%d",&n);
    for(int i=0;i<7;i++){
        if(n%2==1)
            an++;
        n/=2;
    }
    printf("%d",an);
}