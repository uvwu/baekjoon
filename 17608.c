#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int max=a[n-1];
    int num=1;
    for(int i=0;i<n;i++){
        if(a[n-1-i]>max){
            num++;
            max=a[n-1-i];
        }
    }
    printf("%d\n",num);
}