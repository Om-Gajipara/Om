#include<stdio.h>

int main(){
	int height,base;
	float Area;
	
	printf("Enter the height(h):");
	scanf("%d",&height);
	
	printf("Enter the base(b):");
	scanf("%d",&base);

	printf("Area=%d",((height*base)/2));

	return 0;
}

