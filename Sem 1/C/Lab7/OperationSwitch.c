#include<stdio.h>

int main(){
	int   n,a,b;

	
	printf("Enter value of a:");
	scanf("%d", &a);
	
	printf("Enter value of b :");
	scanf("%d", &b);
	
	printf(" press 1 to addition\n press 2 to Substract\n press 3 to multiply\n press 4 to Divide\n");
	scanf("%d",&n);
	
	switch(n){
		case 1:printf("total is %d",a+b);
					break;
		case 2:printf("total is %d",a-b);
					break;
		case 3:printf("total is %d",a*b);
					break;
		case 4:printf("total is %d",a/b);
					break;
		
		default:printf("Not valid operation!");
	}
	
	
	return 0;
	
}
