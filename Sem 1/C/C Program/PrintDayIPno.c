//print day using switch
#include<stdio.h>


int main(){
	int n;
	printf("enter number of day(1 to 7): ");
	scanf("%d",&n);
	
		switch(n){
		case 1:printf("Monday");
		break;

		case 2:printf("Tuesday");
		break;

		case 3:printf("Wednesday");
		break;

		case 4:printf("Thusday");
		break;
		
		case 5:printf("Friday");
		break;
		
		case 6:printf("Saturday");
		break;
		
		case 7:printf("Sunday");
		break;

	  default:printf("invalid input");
	}
	return 0;
}

