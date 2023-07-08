#include<stdio.h>

int main(){
	
	int a,b,c,max=0;
	
		printf("enter value of a:");
		scanf("%d", &a);
	
		printf("enter value of b:");
		scanf("%d", &b);
		
		
		printf("enter value of c:");
		scanf("%d", &c);
		
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		printf("maximum value is %d",max);
	
	return 0;
}
