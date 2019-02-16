#include<stdio.h>
#include<ctype.h>
#include<string.h>

int main()
{
    char str[1000];
    int i, space=1;
    while(gets(str)!=EOF)
    {
    for (i=0; str[i]!='\0'; i++)
    {
        if(str[i]==' ')
        {
        space++;
        }

    }
    printf("%d\n",space);

}
  return 0;

    }
