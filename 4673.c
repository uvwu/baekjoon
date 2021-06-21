#include<stdio.h>
#include<stdlib.h>
int main(){
    int *a=(int*)calloc(10001,sizeof(int));
    for(int i=1;i<10001;i++){
        if(i+i/1000+i/100%10+i/10%10+i%10<10001)
            a[i+i/1000+i/100%10+i/10%10+i%10]=1; 
    }
    for(int i=1;i<10001;i++){
        if(a[i]!=1)
            printf("%d\n",i);
    }
    return 0;
}