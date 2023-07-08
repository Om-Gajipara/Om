#include<stdio.h>

int main (){
	int n,digit;
	printf("Enter Number:");
	scanf("%d",&n);
	
	digit=n%10;
	
	if(digit%2==0){
		printf("last digit is even");
		
	}else {
			printf("last digit is odd");
		
	}
		return 0;
}
