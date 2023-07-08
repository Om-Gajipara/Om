#include<stdio.h>

	int main(){
	int n,sum=0,i;
			
	printf("enter number :");
	scanf("%d",&n);
	
	i=1;
	while(i<n){
		
		if(n%i==0){
			sum=sum+i;
		}
		i++;
		}
		
	(n=sum)?printf("Perfect number"):printf("NOT Perfect number");

	return 0;
	
	}
	
	
	
	
	


