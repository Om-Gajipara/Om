#include<stdio.h>
// Print temperature from fahrenheit to celsius.
	int main(){
		float f,c;
		
		printf("enter temperature in fahrenheit :");
		scanf("%f", &f);
	
		
		printf("Temperature in Celsius is  %f", c=(((f-32)*5))/9);
		
		
		
		return 0;
	}
