#include<stdio.h>
	
	int main(){
	 
	 int x,a,b;
	printf("Enter first value:");
	scanf("%d", &a);
	
	printf("Enter value of b :");
	scanf("%d", &b);
	 
	      printf(" press 1 to addition\n press 2 to Substract\n press 3 to multiply\n press 4 to Divide\n");
	scanf("%d",&x);
	
	if(x==1){
		printf("total is %d",a+b);
		
	}else if (x==2){
		printf("total is %d",a-b);
		
	}else if(x==3)
{
			printf("total is %d",a*b);

	}else if(x==4){
	
		printf("total is %d",a/b);
		
	}
		
		return 0;
		
	}
