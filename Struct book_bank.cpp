#include<stdio.h>
struct book_bank
{
char title[20];
char auther[15];
int  pages;
float price;
};
mmain()
{
struct personal book1;
scanf("%s",book1.title);
scanf("%s",book1.auther);
scanf("%d",&book1.pages);
scanf("%f",&book1.price);
printf("%s %s %d %f",book1.title,book1.auther,book1.pages,book1.price);
}







