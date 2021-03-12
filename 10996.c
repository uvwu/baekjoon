#include<stdio.h>
void f(int a);
void b(int a);
int main(){
    int n;
    scanf("%d",&n);
    if(n==1)
        printf("*\n");
    else{
        for(int i=0;i<n;i++){
            f(1),b((n-1)/2),printf("\n");
            b(n/2),printf("\n");
        }
    }
}
void f(int a){
    if(a==0) return;
    printf("*");
    f(a-1);
}
void b(int a){
    if(a==0) return;
    printf(" *");
    b(a-1);
}