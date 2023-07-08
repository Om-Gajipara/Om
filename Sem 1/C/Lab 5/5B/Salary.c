#include<stdio.h>

int main(){
	float salary,HRA,DA,Gross_salary;
	
	printf("Enter your Salary :");
	scanf("%f",&salary);
	
	if(salary>=10000 && salary<20000){
		HRA=0.20*salary;
		DA=0.80*salary;
	
	}else if(salary>=20000 && salary<30000){
		HRA=0.25*salary;
		DA=0.9*salary;
	
	}else if (salary>=30000 && salary<40000){
		HRA=0.30*salary;
		DA=0.95*salary;
		
	}
	 printf("Your Gross salary is %f", Gross_salary=salary+HRA+DA );
	
	
	return 0;
	
}
