#include<stdio.h>

int main(){
	
	int i,n,count=0;
	
	printf("enter number :");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	
	count==2?printf("prime number"):printf(" not prime number");
	
	return 0;
}
