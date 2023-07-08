#include<stdio.h>

int main(){
	int a,n;
	printf("Enter a Number:");
	scanf("%d",&a);
	
	n=a%10;
	
	if(n%2==0){
		printf("Last digit( %d ) is even",n);
	}
	else{
		printf("Last digit( %d ) is odd",n);
	}
	return 0;
}
