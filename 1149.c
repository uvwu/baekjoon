#include<stdio.h>
#define min(a,b) ((a) < (b) ? (a) : (b))
int main(void){
    int n;
    scanf("%d",&n);
    int a[n][3];
    for(int i=0;i<n;i++){
        scanf("%d %d %d",&a[i][0],&a[i][1],&a[i][2]);
    }
    for(int i=1;i<n;i++){
        a[i][0]=a[i][0]+min(a[i-1][1],a[i-1][2]);
        a[i][1]=a[i][1]+min(a[i-1][0],a[i-1][2]);
        a[i][2]=a[i][2]+min(a[i-1][1],a[i-1][0]);
    }
    printf("%d\n",min(min(a[n-1][0],a[n-1][1]),a[n-1][2]));
}