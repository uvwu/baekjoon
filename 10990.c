#include<stdio.h>
void f(int a);
void b(int a);
int main(){
    int n;
    scanf("%d",&n);
    b(n-1),f(1),printf("\n");
    for(int i=1;i<n;i++){
        b(n-i-1),f(1),b(2*i-1),f(1);
        printf("\n");
    }
}
void f(int a){
    if(a==0) return;
    printf("*");
    f(a-1);
}
void b(int a){
    if(a==0) return;
    printf(" ");
    b(a-1);
}