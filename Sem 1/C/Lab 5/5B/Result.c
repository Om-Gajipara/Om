#include<stdio.h>

int main(){
	int a,b,c,d,e,avg;

	printf("enter value of Subject 1:");
	scanf("%d", &a);
	
	printf("enter value of Subject 2:");
	scanf("%d", &b);
		
		
	printf("enter value of Subject 3:");
	scanf("%d", &c);
	
	
		
	printf("enter value of Subject 4:");
	scanf("%d", &d);
	
	
		
	printf("enter value of Subject 5:");
	scanf("%d", &e);
	
	avg=(a+b+c+d+e)/5;
	
	if(avg<35){
		printf("Fail!!");
	
	}else if (avg>=35 && avg<45){
		printf("pass Class");
	}else if (avg>=45 && avg<60){
		printf("Second Class");
	}else if (avg>=60 && avg<70){
		printf("First Class");
	}else if (avg>=70 && avg<=100){
		printf("Distinction!! ");
	}
 		
 		return 0;
 		
 }
