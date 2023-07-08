#include<stdio.h>

int main(){
	int i,n,odd=0,even=0;
	scanf("%d",&n);
	
	int num[n];
	for(i=0;i<n;i++)
	{
		printf("array element are \n");
		scanf("%d",&num[i]);
	}
	
	for(i=0;i<n;i++)
	{
		if(num[i]%=0)
		{
			even+=1;
		}
		else
		{
			odd+=1;
		}
	}
	
	printf("even numbers:%d,odd number:%d",even,odd);
	
	return 0;
	
}
