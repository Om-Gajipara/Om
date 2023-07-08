#include<stdio.h>
int main(){
	int n,x,y;

	printf("enter number (n)");
	scanf("%d",&n);

	x=n<<1;
	y=n>>1;

	printf("multyplication by 2= %d",x);
	printf("\ndivison by 2= %d",y);

	return 0;
}
