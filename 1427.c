#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[10]={0};
    while (n!=0)
    {
        int o=n%10;
        a[o]++;
        n=(n-o)/10;
    }
    for(int i=9;i>-1;i--){
        if(a[i]>0){
            for(int j=0;j<a[i];j++){
                printf("%d",i);
            }
        }
    }   
}