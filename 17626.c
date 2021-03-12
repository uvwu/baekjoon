#include<stdio.h>
int r(int a);
int count=0;
int main(){
    int n;
    scanf("%d",&n);

    printf("%d",r(n));
}
int r(int a){
    if(a==0)
        return count;
    int i=1;
    while (a>=i*i){
        i++;
    }
    count++;
    printf("%d\n",(i-1)*(i-1));
    return r(a-(i-1)*(i-1));
}