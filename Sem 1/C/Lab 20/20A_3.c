#include<stdio.h>
struct stucture {
	int a;
	char b[100];
	float c;
}s;

union unionn {
	int x;
	char y[100];
	float z;
}u;

int main(){
	printf("size of stucture: %d\n",sizeof(s));
	printf("size of union: %d\n",sizeof(u));
}
