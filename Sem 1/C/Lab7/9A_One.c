#include<stdio.h>

int main(){
	int sumplus,n,Ans;
	
	printf("Enter number :\n");
	scanf("%d",&n);
	
	int i=1;
	while(1<=n){
		sumplus += i;
		i += 2;
		
	}
	
	int j=0,summinus;
	while(1<=n){
	
		summinus += j;
	}
		j += 2 ;
		
		Ans=sumplus-summinus;

	printf("answer is %d\n",Ans);
	return 0;
}
