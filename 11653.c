#include<stdio.h>
int f(int a);
int main(){
    int n;
    scanf("%d",&n);
    int i=2;
    while(n>1){
        while(i<n+1){
            if(n%i==0){
                printf("%d\n",i);
                n/=i;
                break;}
            i++;
        }
    }
    //printf("%d\n",n);
}