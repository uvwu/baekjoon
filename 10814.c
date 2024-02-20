#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Person
{
    char name[101];
    int age;
    int num;
}person;

int compare(const void *a,const void *b){
    if(((person*)a)->age > ((person*)b)->age)
        return 1;
    else if(((person*)a)->age < ((person*)b)->age)
        return -1;
    else
        return (((person*)a)->num - ((person*)b)->num);
}
int main()
{
    person* member;
    member=malloc(sizeof(person)*100000);
    int n;
    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d %s",&(member[i].age), member[i].name);
        member[i].num=i;
    }

    qsort(member,n,sizeof(person),compare);

    for(int i=0;i<n;i++){
        printf("%d %s\n",member[i].age,member[i].name);
    }gdd
    free(member);
    return 0;
}