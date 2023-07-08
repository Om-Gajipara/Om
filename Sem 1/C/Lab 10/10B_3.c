#include<stdio.h>

int main(){
	int n,sum=0,digit;
	
	printf("enter number :");
	scanf("%d",&n);
	
		while(n>1){
		digit=n%10;	
		sum=sum+((digit)*(digit)*(digit));
		n=n/10;
}

	(sum=n)?printf("armstrong number"):printf(" not armstrong number");
	
	return 0;
}
