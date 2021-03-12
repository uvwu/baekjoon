#include<stdio.h>
#include<stdbool.h>
bool f(int a);
int main(){
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        int num,a=2,b;
        scanf("%d",&num);
        while(a<num){
            if(f(a)&&f(num-a)){
                break;}
            else 
                a++;
        }
        printf("%d %d\n",a,num-a);
    }
}
bool f(int a){
    int i=1,n=0;
    while(i<a+1){
        if(a%i==0)
            n++;
        i++;
    }
    if(n==2)
        return true;
    return false;
}