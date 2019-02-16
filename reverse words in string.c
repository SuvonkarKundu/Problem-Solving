#include<stdio.h>
#include<string.h>
int main()
{
     char str[5000];
     int i,temp;
     while(gets(str))
     {
     for(i=0; str[i]!=NULL; i++)
     {
        if(str[i+1]==' ' || str[i+1]==NULL)
        {
            for(temp=i; temp>=0&&str[temp]!=' '; temp--)
            printf("%c", str[temp]);
            if(str[i+1]==NULL)
            {
             break;
            }
             printf(" ");

            }
        }
     printf("\n");
     }

     }


