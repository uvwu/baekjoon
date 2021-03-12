#include<stdio.h>
#define max(a,b) ((a) > (b) ? (a) : (b))
int main(){
    int n;
    scanf("%d",&n);
    int a[n];//입력
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int b[n];//임의 저장
    int c[n];//최소
    b[0]=c[0]=a[0];
    for(int i=1;i<n;i++){
        if(b[i-1]<0){
            b[i]=a[i];
        }
        else{
            b[i]=b[i-1]+a[i];}
        c[i]=max(max(c[i-1],b[i]),a[i]+b[i-1]);
    }
    printf("%d\n",c[n-1]);
}