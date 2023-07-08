#include<stdio.h>

int main(){
	char name[10],i,count=0;
	scanf("%s",&name);
	printf("%s",name);
	
	for(i=0;name[i]!='\0';i++)
	{
		count++;
	}
	printf("\nlength of string is %d\n",count);
	return 0;
}
