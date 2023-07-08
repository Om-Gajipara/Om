#include <stdio.h>

void main(){
   int i,n,a[100],odd_count=0,even_count=0;

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
				if(a[i]%2==1){
					odd_count=odd_count+1;
				}
				else{
					even_count=even_count+1;
				}
			}

   printf("\n odd element's count: %d",odd_count);
   printf("\n even element's count: %d",even_count);
}
