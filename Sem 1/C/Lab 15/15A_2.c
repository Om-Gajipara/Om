#include<stdio.h>

int main(){
	int n,i,neg=0,pos=0;
	
	scanf("%d",&n);
	
	int arr1[n];
	
	for(i=0;i<n;i++){
		printf("enter array element:");
		scanf("%d",&arr1[i]);
	}
	for(i=0;i<n;i++){
		if(arr1[i]<0){
			neg++;
		}
		else{
			pos++;
		}
	}
	
	printf("no.of +/ve is %d ,no.of -/ve is %d",pos,neg);
	return 0;
}
