#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int compare(int *a,int *b){
    return (*a-*b);
}
int main()
{
    int arr[9];
    int sum=0;
    int fakeIdx1;
    int fakeIdx2;
    for(int i=0;i<9;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    qsort(arr,9,sizeof(int),compare);
    int fakeSum=sum-100;
    for(int i=0;i<8;i++){
        for(int j=i+1;j<9;j++){
            if(arr[i]+arr[j]==fakeSum){
                fakeIdx1=i;
                fakeIdx2=j;
                break;
            }
        }
    }
    for(int i=0;i<9;i++){
        if(i!=fakeIdx1 && i!=fakeIdx2)
            printf("%d\n",arr[i]);
    }
}