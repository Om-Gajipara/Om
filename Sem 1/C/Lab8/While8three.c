#include<stdio.h>

int main(){
	int n1,n2;
	
		printf("enter number n1 :");
		scanf("%d", &n1);
		
		printf("enter number n2:");
		scanf("%d", &n2);
		
		
			int j=n1;
		while(j<=n2)
		{
				if(j%2==0){
					
				printf("%d\n", j);
				}
				j++;
		}
	return 0;
}
