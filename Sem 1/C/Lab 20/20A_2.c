#include<stdio.h>
struct Book {
	char name[100];
	char author[100];
	char publication[100];
	int price;
};

int main(){
	struct Book b1,b2,b3;
	
	//book1
	printf("\n Enter Book 1 details \n");
	printf("enter book name: ");
	scanf("%s",&b1.name);
	
	printf("enter author name: ");
	scanf("%s",&b1.author);
	
	printf("enter publication: ");
	scanf("%s",&b1.publication);
	
	printf("enter price: ");
	scanf("%d",&b1.price);
	
	//book2
	printf("\n Enter Book 2 details \n");
	printf("enter book name: ");
	scanf("%s",&b2.name);
	
	printf("enter author name: ");
	scanf("%s",&b2.author);
	
	printf("enter publication: ");
	scanf("%s",&b2.publication);
	
	printf("enter price: ");
	scanf("%d",&b2.price);
	
	//book3
	printf("\n Enter Book 3 details \n");
	printf("enter book name: ");
	scanf("%s",&b3.name);
	
	printf("enter author name: ");
	scanf("%s",&b3.author);
	
	printf("enter publication: ");
	scanf("%s",&b3.publication);
	
	printf("enter price: ");
	scanf("%d",&b3.price);
	
	//book details
	printf("\n Book 1 details \n");
	printf("book name: %s\nauthor name: %s\npublication: %s\nprice: Rs %d\n",b1.name,b1.author,b1.publication,b1.price);
	printf("\n Book 2 details \n");
	printf("book name: %s\nauthor name: %s\npublication: %s\nprice: Rs %d\n",b2.name,b2.author,b2.publication,b2.price);
	printf("\n Book 3 details \n");
	printf("book name: %s\nauthor name: %s\npublication: %s\nprice: Rs %d\n",b3.name,b3.author,b3.publication,b3.price);
}
