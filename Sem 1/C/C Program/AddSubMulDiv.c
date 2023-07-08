#include<stdio.h>
int main(){
	int n,a,b;
	
	printf("enter number (a)");
	scanf("%d",&a);
	
	printf("enter number (b)");
	scanf("%d",&b);
	
	printf("(1)for addition \n(2)substraction \n(3)multiplication \n(4)Division :");
	scanf("%d",&n);

	switch(n){
		case 1:printf("Sum=%d",a+b);
		break;
		
		case 2:printf("Sum=%d",a-b);
		break;
		
		case 3:printf("Sum=%d",a*b);
		break;
		
		case 4:printf("Sum=%d",(a/b));
		break;
		
	  default:printf("invalid input");
	}
	return 0;
}
