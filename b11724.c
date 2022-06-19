#include<stdio.h>
#include<stdlib.h>
int parent[1001];
int cp[1001];
int n,m;
int u,v;
int cc=0;
int find(int x){
	if(parent[x]==x)
		return x;
	else
		return parent[x]=find(parent[x]);
}
void union1(int x,int y){
	
	int xp=find(x);
	int yp=find(y);
	
	if(xp>yp){
		parent[xp]=yp;
	}
	else if(yp>xp){
		parent[yp]=xp;
	}
}
int main(){
	
	scanf("%d %d",&n,&m);
	
	for(int i=1;i<=n;i++){
		parent[i]=i;
		cp[i]=0;
	}
	
	for(int i=0;i<m;i++){
		scanf("%d %d",&u,&v);
		union1(u,v);	
	}
	
	for(int i=1;i<=n;i++){
		cp[find(parent[i])]++;
	}
	
	for(int i=1;i<=n;i++){
		if(cp[i]>0)
			cc++;
	}
	
	
	printf("%d\n",cc);
}