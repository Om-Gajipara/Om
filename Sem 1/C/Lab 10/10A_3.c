#include<stdio.h>

int main(){
	int n,count=0,i;
	
	printf("enter number :");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count+=1;
		}
	}
	
	(count==2)?printf("number is prime "):printf("number is not prime ");

	return 0;
}
