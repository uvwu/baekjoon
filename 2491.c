#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max(x,y) ((x>y) ? (x) : (y))
#define min(x,y) ((x<y) ? (x) : (y))
int main()
{
    int n;
    int m=1;
    int dp1[100000];//inc
    int dp2[100000];//dec
    scanf("%d",&n);
    int a[100000];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    dp1[0]=dp2[0]=1;
    for(int i=1;i<n;i++){
        dp1[i]=dp2[i]=1;

        if(a[i]>=a[i-1]){
            dp1[i]=max(dp1[i],dp1[i-1]+1);
        }
        if(a[i]<=a[i-1]){
            dp2[i]=max(dp2[i],dp2[i-1]+1);
        }
        

        m=max(m,max(dp1[i],dp2[i]));
    }
    printf("%d\n",m);
}