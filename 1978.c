#include<stdio.h>
int main(){
    int n,num=0;
    scanf("%d",&n);
    int a[100][2]={0};
    for(int i=0;i<n;i++){
        scanf("%d",a[i]);
        for(int j=1;j<a[i][0]+1;j++){
            if(a[i][0]%j==0){
                ++a[i][1];
            }
        }
        if(a[i][1]==2)
            num++;
    }
    printf("%d\n",num);
}