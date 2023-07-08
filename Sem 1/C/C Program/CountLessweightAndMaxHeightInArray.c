#include <stdio.h>

void main(){
   int i,n,w[100],h[100],max_height=0,min_weight=0;

		printf("  Count number of positive or negative number from an array of n numbers. \n");
		printf("  -------------------------------------------------------------- \n");

		printf("enter size of array :");
		  scanf("%d",&n);


		 	for(i=0;i<n;i++)
	    {
	    printf("enter %d persons height :");
		  scanf("%d",&w[i]);
		  printf("enter %d persons weight :");
			scanf("%d",&h[i]);
		  }

			for(i=0;i<n;i++){
				if(h[i]>170){
					max_height++;
				}
				if(w[i]<50){
					min_weight++;
				}
			}
  		printf("\n no. of person less then 50kg weight is: %d",min_weight);
  		printf("\n no. of person less then 170cm is: %d",max_height);
}
