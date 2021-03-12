#include<stdio.h>
#include<stdlib.h>
int main(){
    int n,i=1;
    scanf("%d",&n);
    if(n==1){
        printf("%d\n",0);
    }
    else{
    int *a;
    a=(int*)calloc(3*(n+1),sizeof(int));
    for(i=1;i<n;i++){
        if((a[i*3]>a[i]+1)||a[i*3]==0) 
            a[i*3]=a[i]+1;
        if((a[i*2]>a[i]+1)||(a[i*2]==0))
            a[i*2]=a[i]+1;
        if((a[i+1]>a[i]+1)||(a[i+1]==0))
            a[i+1]=a[i]+1;
    }
    printf("%d\n",a[n]);}
}