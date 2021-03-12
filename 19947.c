#include<stdio.h>
int main(){
    int y;
    float m;
    scanf("%f %d",&m,&y);
    while(y>0){
        if(y==6){
            m=m*1.2;
            m=m*(int)1.2;
            y=0;
        }wj
        else if (y==7){
            m=m*1.2;
            m=(int)m*1.2;
            m=(int)m*1.05;
            y=0;
        }
        else if(y>4){
            y-=5;
            m=(int)m*(1+0.35);
         }
        else if(y>2){
            y-=3;
            m=(int)m*(1+0.2);
        }
        else{
            y-=1;
            m=(int)m*(1+0.05);
            }
    }
    printf("%d\n",(int)m);
    return 0;
}
