#include<stdio.h>
void main()
{
char s1[100],s2[100],s3[200];
int i,j;
gets(s1);
gets(s2);
for(i=0;s1[i]!='\0';i++)
{
s3[i]=s1[i];
}
for(j=0;s2[j]!='\0';j++)
{
s3[i+j+1]=s2[j];
}
s3[i+j+1]='\0';
printf("%s",s3);
}










