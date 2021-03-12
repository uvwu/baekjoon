#include<stdio.h>
void p(int a);
int main(void){
    int n;
    scanf("%d",&n);
    p(n);
}
void p(int a){
    if(a==3){
        for(int i=0;i<3;i++)
            printf("*");
        printf("\n");
        printf("*");
        printf(" ");
        printf("*");
        printf("\n");
        for(int i=0;i<3;i++)
            printf("*");
        return;
    }
    else{
        for(int i=0;i<3;i++)
            p(a/3);
    }
}