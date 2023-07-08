#include<stdio.h>

int main(){
	int i,n;
	
	for(i=1;i<=10;i++)
	{
		printf("%d\n",i);
	}
	
	printf("enter number :");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		printf("%d\n",i);
	}	
	return 0;
}
