#include<stdio.h>
#include<time.h>

int main(){
	time_t t;
	time(&t);
	
	printf("\n Cutent tome and date is: %s", ctime(&t));
	
	return 0;
}
