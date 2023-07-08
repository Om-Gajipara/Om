#include<stdio.h>

void main(){
	
	int sum=0,n,count=0;
	
	while(1){
		printf("enter 0 to stop:");
		scanf("%d",&n);
		
		if(n==0){
			break;
		}
		sum+=n;
		count++;
	}
	
	printf("sum is %d",sum);
	printf("\nAvg is %d",sum/count);
}
