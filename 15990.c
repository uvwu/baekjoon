#include<stdio.h>
#define k 1000000009
int main(){
    int t;
    scanf("%d",&t);
    long long a[100001][3];
    a[1][0]=1,a[1][1]=0,a[1][2]=0,a[2][0]=0,a[2][1]=1,a[2][2]=0,a[3][1]=a[3][0]=a[3][2]=1;
    for(int i=4;i<100001;i++){
        a[i][0]=(a[i-1][1]+a[i-1][2])%k;
        a[i][1]=(a[i-2][0]+a[i-2][2])%k;
        a[i][2]=(a[i-3][0]+a[i-3][1])%k;
    }
    for(int i=0;i<t;i++){
        int n;
        scanf("%d",&n);
        printf("%lld\n",(a[n][0]+a[n][1]+a[n][2])%k);
    }
}
