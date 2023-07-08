#include<stdio.h>

int main(){
	
	int n,ld,ans,first;
	
	printf("enter number :");
	scanf("%d",&n);
	
	ld=n%10;
	
	while(n>=10){
		n=n/10;
	}
	
	first=n;
	
	printf("sum is %d",ans=first+ld);
	return 0;
}
