#include<stdio.h>

int main(){
	int salary ,HRA , DA;
	printf("enter your basic salary :");
	scanf("%d",&salary);

	
	if(salary>=10000){
		HRA = salary*0.02;
		DA = salary*0.08;
		
		printf("Gross salary is :%d",(HRA+DA+salary));
	}
	
		else if(salary>=20000){
		HRA = salary*0.025;
		DA = salary*0.09;

		printf("Gross salary is :%d",(HRA+DA+salary));
	}
		
		else if(salary>=30000){
		HRA = salary*0.02;
		DA = salary*0.08;

		printf("Gross salary is :%d",(HRA+DA+salary));
	}

}
