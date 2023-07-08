#include<stdio.h>

int main(){
	int a,b;
	
	printf("enter two value : \n");
	scanf("%d %d",&a,&b);

	if((a^b)==0){
		printf("Equal");
		
	}else{
		printf("not equal");
	}
	return 0;
}
