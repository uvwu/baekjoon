#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[11]={0};
    a[0]=a[1]=0,a[2]=1;
    for(int i=3;i<11;i++){
        if(i%2==1){
            a[i]=+((i-1)*(i+1))/4+a[(i+1)/2]+a[(i-1)/2];
        }
        else{
            a[i]=a[i/2]*2+(i*i)/4;
        }
    }
    printf("%d\n",a[n]);
}