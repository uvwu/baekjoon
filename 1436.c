#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    int n;
    char num[10];
    scanf("%d",&n);
    int cNum=1;
    int start=666;
    while (cNum<n)
    {
        start+=1;
        sprintf(num,"%d",start);
        for(int i=0;i<10;i++){
            if(num[i]=='6'&&num[i+1]=='6' && num[i+2]=='6'){
                cNum++;
                break;
            }
        }
        
    }
    printf("%d\n",start);
}