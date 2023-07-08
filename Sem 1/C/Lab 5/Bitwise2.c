#include<stdio.h>

int main(){
	int n;
	
	printf("Enter value :");
	scanf("%d", &n);
	
	if(n&1==1){
		printf("even");
		
	}else printf("odd");
	return 0;
	
}
