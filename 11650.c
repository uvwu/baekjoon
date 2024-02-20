#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct pos
{
    int x;
    int y;
}pos;
int compare(const void *a,const void *b){
    if(((pos*)a)->x > ((pos*)b)->x)
        return 1;
    else if(((pos*)a)->x < ((pos*)b)->x)
        return -1;
    else{
        return (((pos*)a)->y - ((pos*)b)->y);
    }
}
int main()
{
    int n;
    scanf("%d",&n);
    pos *arr;
    arr=malloc(sizeof(pos)*n);
    for(int i=0;i<n;i++){
        scanf("%d %d",&arr[i].x,&arr[i].y);
    }
    qsort(arr,n,sizeof(pos),compare);

    for(int i=0;i<n;i++){
        printf("%d %d\n",arr[i].x,arr[i].y);
    }
    free(arr);
    return 0;
}