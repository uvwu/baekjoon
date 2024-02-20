#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int compare(const void *a,const void *b){
    int cmp=strlen(a)-strlen(b);
    if(cmp>0)
        return 1;
    else if(cmp<0)
        return -1;
    else return strcmp(a,b);
}
int main()
{
    int n;
    scanf("%d",&n);
    char str[20000][51];

    for(int i=0;i<n;i++){
        scanf("%s",&str[i]);
    }

    qsort(str,n,sizeof(str[0]),compare);
   
    for(int i=0;i<n;i++){
        if(strcmp(str[i],str[i+1])!=0 )
            printf("%s\n",str[i]);
    }
}