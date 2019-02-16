#include<stdio.h>
void main()
{
char str[100];
int i,space=0;
gets(str);
for(i=0;str[i]!='\0';i++)
{
space++;
}
printf("%d",space);
}









