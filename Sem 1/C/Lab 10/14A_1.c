#include<stdio.h>

int main(){
	
	int num[100],n,i;
	
	printf("enter number of array element:");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("array element are \n");
		scanf("%d",&num[i]);
	}
	
	for(i=n-1;i>=0;i--)
	{
		printf("array element in reverse are %d\n",num[i]);
	}
	
	return 0;
}
