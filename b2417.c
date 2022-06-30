#include<stdio.h>
unsigned long long int n;

unsigned long long int expo(int x){
	if(x<=0){
		return 0;
	}
	else{
		unsigned long long int expoN=1;
		
		for(int i=0;i<x;i++){
			expoN*=2;
		}
		return expoN;
	}
}
unsigned long long int binarySearch(unsigned long long int st,unsigned long long int end){
	
	unsigned long long int mid=(st+end)/2;
	
	if(st>=end)
		return 0;
	
	if(mid*mid>=n && (mid-1)*(mid-1)<n)
		return mid;
	
	else if(mid*mid>=n)
		return binarySearch(st,mid);
	else if(mid*mid<n)
		return binarySearch(mid+1,end);
	
}
int main(){
	
	scanf("%lld",&n);
	//printf("%lld\n",expo(n));
	printf("%lld\n",binarySearch( 0,4294967296));
	return 0;
}