#include<stdio.h>

int main(){
	int n,i,num;
	
	scanf("%d",&n);
	
	int arr1[n];
	
	for(i=0;i<n;i++){
		printf("enter array element:");
		scanf("%d",&arr1[i]);
}
	printf("Enter the number you want to found:");
	scanf("%d",&num);
	
	for(i=0;i<n;i++){
		if(num==arr1[i]){
			printf("your number's index value is %d",i);
		}
	}	
	return 0;
}

