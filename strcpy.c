#include<stdio.h>
void main()
{
char s1[100],s2[100];
int i;
gets(s2);
for(i=0;s1[i]!='\0';i++)
{
s2[i]=s1[i];
printf("%c",s2[i]);
}
}







