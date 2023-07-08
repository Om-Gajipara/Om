#include<stdio.h>
int main(){
	int n,a,b,c;

	printf("enter number (a)");
	scanf("%d",&a);

	printf("enter number (b)");
	scanf("%d",&b);
	
	printf("enter number (c)");
	scanf("%d",&c);
	
	n=((a>b)?((a>c)?a:c):((b>c)?b:c));
	printf("Largest=%d",n);
	
	
	return 0;
}
