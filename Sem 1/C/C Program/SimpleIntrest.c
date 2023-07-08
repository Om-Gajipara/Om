#include<stdio.h>

int main(){
	float p,r,t;

	printf("Enter the principal(p):");
	scanf("%f",&p);

	printf("Enter the rate of intrest(r):");
	scanf("%f",&r);
	
	printf("Enter the timeperiod:");
	scanf("%f",&t);

	printf("SI=%f",((p*r*t)/100));

	return 0;
}
