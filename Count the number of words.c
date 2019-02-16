
#include<string.h>
int main()
{
char str[100];
int i,space=1;
gets(str);
for(i=0;str[i]!='\0';i++)
{
if(str[i]==' ')
{
space++;
}
}
printf("There are %d words\n",space);
return 0;
}













