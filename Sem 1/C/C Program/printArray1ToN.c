#include <stdio.h>

void main(){
   int i,n,a[100];

		printf("Read n numbers from user and print in normal and reverse order \n");
		printf("-------------------------------------------------------------- \n");
		
   	printf("enter value :");
		scanf("%d",&n);
		
		 	for(i=0;i<n;i++)
	      {
		  a[i]=i+1;
		  }

   printf("\nThe values store into the array are : \n");
   for(i=0;i<n;i++)
     {
	   printf("%d \n",a[i]);
	 }

   printf("\n\nThe values store into the array in reverse are :\n");
   for(i=n-1;i>=0;i--){
	   printf("%d \n",a[i]);
		}
}

