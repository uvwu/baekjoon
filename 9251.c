#include<stdio.h>
int main(){
    char a[1000]="",b[1000]="";
    int num=0,j=0,t=0;
    scanf("%s %s",a,b);
    for(int i=0;i<1000;i++){
        j=t+1;
        while(j<1000){
            if((a[i]==b[j])&&(a[i]>0)){
                t=j;
                num++;
                break;
             }
             j++;
        }
    }
    printf("%d\n",num);
}