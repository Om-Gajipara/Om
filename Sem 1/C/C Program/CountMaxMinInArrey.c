#include <stdio.h>

void main(){
   int i,n,a[100],max=0,min=0,sum=0,avg=0,count=0;

		printf("  Count number of positive or negative number from an array of n numbers. \n");
		printf("  -------------------------------------------------------------- \n");

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
			for(i=0;i<n;i++){
				if(a[i]>max){
					max=a[i];
				}
				if(a[i]<min){
					min=a[i];
				}
			}
			printf("\n sum is: %d",sum);
			printf("\n avg is: %d",sum/count);
  		printf("\n minimum no. is: %d",min);
  		printf("\n maximum no. is: %d",max);
}
