#include<stdio.h>

int main(){
	int a,b,c  ;
	
	printf("enter 3 number : \n");
	scanf("%d",&a);
	
		printf("enter 3 number : \n");
	scanf("%d",&b);
	
		printf("enter 3 number : \n");
	scanf("%d",&c);
	
	switch(a>b){
		
		case 1: printf("Result =%d",a*c);
				break;
		default: printf("Result =%d",b*c);
				break;
			
	}
	return 0;
}
