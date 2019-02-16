#include<stdio.h>
#include<string.h>
main()
{
   char str[100];
   int tc,i,y;
    scanf("%d",&tc);
    getchar();
   for(i=1;i<=tc;i++)
    {
         gets(str);
         y=strlen(str);
           if(y==3&&(str[0]=='o'||str[0]=='n'||str[0]=='e'))
           {
               printf("1\n");
           }
          else if(y==3&&(str[1]=='t'||str[1]=='w'||str[1]=='o'))
          {
                printf("2\n");
          }
        else if(y==5&&(str[2]=='h'||str[2]=='t'||str[2]=='e'||str[2]=='r'))
          {
               printf("3\n");
        }
    }
return 0;
}










