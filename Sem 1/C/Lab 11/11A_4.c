#include<stdio.h>

int main(){
	
	int i,x,y,ans=1;
	
	printf("enter base :");
	scanf("%d",&x);
	
	printf("enter power:");
	scanf("%d",&y);
	
		for(i=1;i<=y;i++)
		{
			ans=ans*x;
		}
		
		printf("Answer is %d\n",ans);
	return 0;
}
