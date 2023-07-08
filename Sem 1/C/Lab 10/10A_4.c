#include<stdio.h>



	void main(){
	int n,digit;
			
	printf("enter number :");
	scanf("%d",&n);
	
	while(n>=1){
		digit=n%10;	
		printf("%d\n",digit);
		
		n=n/10;
	}

}

