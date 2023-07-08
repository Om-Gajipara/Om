#include<stdio.h>

int main(){
	int a,b,c;

	printf("Enter the value(a):");
	scanf("%d",&a);

	printf("Enter the value(b):");
	scanf("%d",&b);
	
	c=a+b;//a=a+b;
	b=c-b;//b=a-b;
	a=c-b;//a=a-b;
	printf("new value of a is %d",a);
	printf("\nnew value of b is %d",b);

	return 0;
}
