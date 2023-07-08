#include<stdio.h>

int main(){
	int a,b,c,d,e,p;
	
	printf("Enter a mark of subject 1 :");
	scanf("%d",&a);
	printf("\nEnter a mark of subject 2 :");
	scanf("%d",&b);
	printf("\nEnter a mark of subject 3 :");
	scanf("%d",&c);
	printf("\nEnter a mark of subject 4 :");
	scanf("%d",&d);
	printf("\nEnter a mark of subject 5 :");
	scanf("%d",&e);

	printf("\nPercentage is : %d %",p=((a+b+c+d+e)/5));

	if( p<=45 && p>=36){
		printf("\npass class");
	}
	else if( p<=60 && p>=46){
		printf("\nSecond class");
	}
	else if( p<=70 && p>=61){
		printf("\nSecond class");
	}
	else if(p>=71){
		printf("\nDistinction");
	}
}
