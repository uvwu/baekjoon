#include<stdio.h>
void f(int a);
void b(int a);
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        if(i%2==0)  printf("*"),b(n-1),printf("\n");
        else    b(n),printf("\n");
    }
}
void f(int a){
    if(a==0) return;
    printf("*"),b(a-1);
    f(a-1);
}
void b(int a){
    if(a==0) return;
    printf(" *");
    b(a-1);
}