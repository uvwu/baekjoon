#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[10001]={0};
    for(int i=0;i<n;i++){
        int k;
        scanf("%d",&k);
        a[k]++;
    }
    for(int i=0;i<10001;i++){
        if(a[i]>0){
            for(int j=0;j<a[i];j++)
                printf("%d\n",i);
        }
    }
}