#include<stdio.h>

int main(){
	int a,b,c;

	printf("Enter the 1st number:");
	scanf("%d",&a);
	printf("Enter the 2nd number:");
	scanf("%d",&b);
	printf("Enter the 3rd number:");
	scanf("%d",&c);

	if(a>b){
		if(a>c){
			printf("a is largest");
		}
		else{
			printf("c is largest");
		}

	}
		else{
			if(b>c){
			printf("b is largest");
		}
		else{
			printf("c is largest");
		}
	
	}

	return 0;
}
