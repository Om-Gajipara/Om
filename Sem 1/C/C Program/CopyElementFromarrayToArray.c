#include <stdio.h>

void main(){
   int i,n,a[100],b[100];

		printf("Read n numbers from user and print in normal and reverse order \n");
		printf("-------------------------------------------------------------- \n");

   	printf("enter size of array :");
		scanf("%d",&n);

		 	for(i=0;i<n;i++)
	      {
				printf("enter element: ");
				scanf("%d",&a[i]);
		  	b[i]=a[i];
		  }

   printf("\nThe values store into the array are : \n");
   for(i=0;i<n;i++)
     {
	   printf("%d \n",a[i]);
	 }

   printf("\n\nThe values copy from array(1) to the array(2) are :\n");
   for(i=0;i<n;i++){
	   printf("%d \n",b[i]);
	 }
}

