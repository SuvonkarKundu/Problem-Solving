#include<stdio.h>
#include<string.h>
main()
{
    char ch[100],str[100],str1[100],str2[100],str3[100],str4[100],str5[100],str6[100];
    int count=1;
    strcpy(str,"HELLO");
    strcpy(str1,"HOLA");
    strcpy(str2,"HALLO");
    strcpy(str3,"BONJOUR");
    strcpy(str4,"CIAO");
    strcpy(str5,"ZDRAVSTVUJTE");
    while(1)
    {
        gets(ch);
        if(ch[0]=='#')
        {
            break;
        }

        if(strcmp(ch,str)==0)
        {
            printf("Case %d: ENGLISH\n",count);

        }

        else if(strcmp(ch,str1)==0)
        {
            printf("Case %d: SPANISH\n",count);
        }

        else if(strcmp(ch,str2))
        {
              printf("Case %d: GERMAN\n",count);

        }

        else if(strcmp(ch,str3)==0)
        {
             printf("Case %d: FRENCH\n",count);
        }
         else if(strcmp(ch,str4)==0)
         {
              printf("Case %d: ITALIAN\n",count);
         }
        else if(strcmp(ch,str5)==0)
        {
            printf("Case %d: RUSSIAN\n",count);

        }
        else
        {
            printf("Case %d: UNKONWN\n",count);

        }
       count++;
    }
return 0;
}















