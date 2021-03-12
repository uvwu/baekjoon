#include<stdio.h>
int min=0;
int f(int a,int b);
int main(){

    int a,b,an;
    scanf("%d\n %d",&a,&b);
    an=f(a,b);
    if(an==0){
        printf("%d\n",-1);
        return 0;}
    printf("%d\n",an);
    printf("%d\n",min);
    return 0;  
}
int f(int a,int b){
    int anw=0;
    min=b;
    for(int i=a;i<b+1;i++){
        int in=0;
        for(int j=1;j<i+1;j++){
            if(i%j==0)
                in++;
        }
        if(in==2){
            anw+=i;
            if(i<min)
                min=i;
        }
    }
    return anw;
}