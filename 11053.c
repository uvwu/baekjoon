#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max(x,y) ((x>y) ? (x) : (y))
#define min(x,y) ((x<y) ? (x) : (y))
int main()
{
    int n;
    int max=0;
    scanf("%d",&n);
    int a[1000];
    int dp[1000];
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]);
    }

    for(int i=0;i<n;i++){
        dp[i]=1;
        for(int j=0;j<i;j++){
            if(a[j]<a[i]){
                dp[i]=max(dp[i],dp[j]+1);
            }
        }
        max=max(max,dp[i]);
    }
    printf("%d\n",max);
}