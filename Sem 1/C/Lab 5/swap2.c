#include<stdio.h>

	int main(){
		float a,b;
		
		printf("enter value of a :");
		scanf("%f", &a);
		printf("enter value of b:");
		scanf("%f", &b);
		 
			a=a+b;
			b=a-b;
			a=a-b;
			
			 
		printf(" New value of a  is %f", a);
			printf(" New value of b is %f", b);
		return 0;
	}
