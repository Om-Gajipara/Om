#include<stdio.h>
struct Student {
	char name[100];
	int percent;
	int age;
};

int main(){
	struct Student s[5];
	int i;
	
	for(i=0;i<5;i++){
		printf("\n Student %d details\n",i+1);
		
		printf("enter name: ");
		scanf("%s",&s[i].name);
		
		printf("enter percentage: ");
		scanf("%d",&s[i].percent);
		
		printf("enter age: ");
		scanf("%d",&s[i].age);
	}
	
	for(i=0;i<5;i++){
		printf("\n Student %d details\n",i+1);
		printf("Student name: %s \nStudent percent: %d  \nStudent age: %d\n",s[i].name,s[i].percent,s[i].age);
	}
	
}
