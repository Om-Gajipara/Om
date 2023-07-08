#include<stdio.h>

// reverse order

	void main(){
	int n,digit,rev=0;
			
	printf("enter number :");
	scanf("%d",&n);
	
	while(n!=0){
		digit=n%10;	
		rev=rev*10+digit;
		
		n=n/10;
	}
		printf("%d\n",rev);
}

