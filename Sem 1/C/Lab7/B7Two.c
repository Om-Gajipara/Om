#include<stdio.h>

int main(){
	char ch;
	
	printf("press any key :\n");
	scanf("%c",&ch);
	
	((ch>='a' && ch<'z') || (ch>='A' && ch<'Z')) ? printf("Alphabet") :  printf(" Not Alphabet");
	return 0;
}
