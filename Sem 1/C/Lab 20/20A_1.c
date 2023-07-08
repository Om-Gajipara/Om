#include<stdio.h>
struct employee {
	char name[100];
	int salary;
	int id;
}emp1;

int main(){
	printf("enter id: ");
	scanf("%d",&emp1.id);
	
	printf("enter name: ");
	scanf("%s",&emp1.name);
	
	printf("enter salary: ");
	scanf("%d",&emp1.salary);
	
	printf("\nemployee details\n");
	printf("Id: %d\nName: %s\nSalary: %d",emp1.id,emp1.name,emp1.salary);
}
