#include<stdio.h>
#include<stdlib.h>
int main(){
    int n,m;
    scanf("%d %d",&n,&m);
    int** a = (int**)malloc(sizeof(int*) * (n + 1));
	for (int i = 0; i < n; i++)
		a[i] = (int*)malloc(sizeof(int) * (n + 1));
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0;i<m;i++){
        int x1,y1,x2,y2,sum=0;
        scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
        for(int i=x1-1;i<x2;i++){
            for(int j=y1-1;j<y2;j++)
                sum+=a[i][j];
        }
        printf("%d\n",sum);
    }
}