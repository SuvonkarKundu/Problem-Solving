#include<stdio.h>
#include<string.h>
main()
{
    char str[100];
    int v,count=1;
    while(1)
    {
        gets(str);
        if(str[0]=='#')
        {
            break;
        }
        v=strlen(str);
        if(v==5&&str[1]=='E')
        {
            printf("Case %d: ENGLISH\n",count);
        }

       else if(v==4&&str[1]=='O')
        {
            printf("Case %d: SPANISH\n",count);
        }

        else if(v==5&&str[1]=='A')
        {
            printf("Case %d: GERMAN\n",count);
        }
        else if(v==7&&str[1]=='O')
        {
            printf("Case %d: FRENCH\n",count);

        }
        else if(v==4&&str[1]=='I')
        {
            printf("Case %d: ITALIAN\n",count);
        }
        else if(v==12&&str[1]=='D')
        {
            printf("Case %d: RUSSIAN\n",count);
        }

        else
        {
            printf("Case %d: UNKNOWN\n",count);
        }
    count++;
    }
 return 0;

}















