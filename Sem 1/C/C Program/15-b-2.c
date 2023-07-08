#include <stdio.h>
#include <math.h>

void main(){
	int a[100],n,i;
	float b[100];
   float sum=0,avg=0,count=0,multy=1;
	 float g_mean,h_mean,harm,h_sum=0,extra;

		printf("  Calculate the average, geometric and harmonic mean of n elements in an array \n");
		printf("  ---------------------------------------------------------------------------- \n");

		printf("enter size of array :");
		  scanf("%d",&n);

		 	for(i=0;i<n;i++)
	    {
	    printf("enter element :");
		  scanf("%d",&a[i]);
		  }
			//avg
			for(i=0;i<n;i++){
				sum=sum+a[i];
				count++;
			}
			avg=sum/count;
			//geometric mean
			for(i=0;i<n;i++){
				multy=multy*a[i];
			}
			g_mean=sqrt(multy);
			//harmonic mean
			for(i=0;i<n;i++){
				b[i]=(1/a[i]);
				h_sum=h_sum+b[i];
			}
			h_mean=(n/(h_sum));
			for(i=0;i<n;i++){
				printf("\n%f",b[i]);
			}
			//print all ans
			printf("\n h_sum :%f",h_sum);
			printf("\n sum :%f",sum);
			printf("\n harm :%f",harm);
			printf("\n avg : %f",avg);
			printf("\n geometric mean : %f",g_mean);
			printf("\n harmonic mean : %f",h_mean);
}

