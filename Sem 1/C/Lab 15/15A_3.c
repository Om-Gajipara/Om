#include<stdio.h>

int main(){
	int n,i,count=0;
	
	scanf("%d",&n);
	
	int arr1[n];
	
	for(i=0;i<n;i++){
		printf("enter array element:");
		scanf("%d",&arr1[i]);
	}
	for(i=0;i<n;i++){
		if(arr1[i]%3==0){
			count++;
		}
}
	
	
	printf("Ans is %d",count);
	return 0;
}
