#include<stdio.h>

int main(){
	float c,f;

	printf("Enter the Fahrenheit(f):");
	scanf("%f",&f);

	printf("c=%f",(((f-32)*5))/9);

	return 0;
}
