#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX(x,y) ((x>y) ? (x) : (y))
typedef struct Case
{
    int time;
    int pay;
}c;
int main()
{
    int n;
    scanf("%d",&n);
    c *arr=malloc((n)*sizeof(c));
    int *max=malloc((n)*sizeof(c));
    for(int i=0;i<n;i++){
        scanf("%d %d",&arr[i].time, &arr[i].pay);
    }
    for(int i=0;i<n;i++){

        int day=i+arr[i].time;
        if(day<n+1){
            max[day]=MAX( max[day], max[i]+arr[i].pay );
        }
        max[i+1]=MAX(max[i+1],max[i]);
    }
    printf("%d\n",max[n]);
    free(arr);
    free(max);
    return 0;
}