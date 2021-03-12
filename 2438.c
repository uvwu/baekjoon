#include<stdio.h>
void f(int a);
void b(int a);
int main(){
    int n;
    scanf("%d",&n);
    for(int i=1;i<n+1;i++){
        f(i);
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