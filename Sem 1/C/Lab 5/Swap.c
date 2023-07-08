#include<stdio.h>

	int main(){
		float temp,a,b;
		
		printf("enter value of a :");
		scanf("%f", &a);
		printf("enter value of b:");
		scanf("%f", &b);
		
		temp=a;
		a=b;
		b=temp;
		 
		printf(" New value of a  is %f", a);
			printf(" New value of b is %f", b);
		return 0;
	}
