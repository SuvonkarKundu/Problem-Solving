#include<stdio.h>
#include<string.h>
void main()
{
char a[100],b[100];
gets(a);
strcpy(b,a);
strrev(b);
if(strcmp(a,b)==0)
{
printf("The string is palindrome");
}
else
printf("The string is not palindrome");
}












