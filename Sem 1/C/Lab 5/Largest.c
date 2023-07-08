#include<stdio.h>

	int main(){
		int a,b,c;
		
		printf("enter value of a:");
		scanf("%d", &a);
	
		printf("enter value of b:");
		scanf("%d", &b);
		
		
		printf("enter value of c:");
		scanf("%d", &c);
	
		if(a>b){
			if(a>c)
			printf("A is largest ");
			
			else {
				printf("Number is C");
			}
			
		} else if(b>c){
			
			printf(" B is largest ");
			
		} else {
				printf(" C is largest ");
		}
		return 0;
		
	}
