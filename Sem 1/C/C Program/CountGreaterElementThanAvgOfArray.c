#include <stdio.h>

void main(){
   int i,n,a[100],sum=0,avg=0,count=0,H_E_Avg_count=0;

		printf("  Count numbers higher than the average of an array. \n");
		printf("  ------------------------------------------------- \n");

		printf("enter size of array :");
		  scanf("%d",&n);


		 	for(i=0;i<n;i++)
	    {
	    printf("enter element :");
		  scanf("%d",&a[i]);
		  }

			for(i=0;i<n;i++){
				sum=sum+a[i];
				count++;
			}
			avg=sum/count;
			for(i=0;i<n;i++){
				if(a[i]>avg){
					H_E_Avg_count++;
				}
			}
			printf("\n avg : %d",avg);
			printf("\n Count higher element's then the avg of all elements is : %d",H_E_Avg_count);
		
}
