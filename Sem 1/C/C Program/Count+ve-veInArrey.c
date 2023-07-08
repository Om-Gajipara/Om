#include <stdio.h>

void main(){
   int i,n,a[100],pcount=0,ncount=0,zcount=0;

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
				if(a[i]>0){
					pcount=pcount+1;
				}
				else if(a[i]<0){
					ncount=ncount+1;
				}
				else if(a[i]==0){
					zcount=zcount+1;
				}
			}
		
   printf("\n Positive element's count: %d",pcount);
   printf("\n Nagetive element's count: %d",ncount);
	 printf("\n no. of zero(0): %d",zcount);
   
}

