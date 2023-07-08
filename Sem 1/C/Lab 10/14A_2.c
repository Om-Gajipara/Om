#include<stdio.h>

int main(){
	int n,i,num[10],pos=0,neg=0;
	
	for(i=0;i<10;i++)
	{
		printf("array element are \n");
		scanf("%d",&num[i]);
	}
	
	for(i=0;i<n;i++)
	{
		if(num[i]>0)
		{
			pos++;
		}
		else
		{
			neg++;
		}
	}
	
	printf("Positive numbers: %d,negative number: %d",pos,neg);
	
}
