#include<stdio.h>
#include<string.h>
main()
{
    char str[100],str1[100],str2[100];
    int y,i,j=0,count=1;
    strcpy(str,"Hajj");
    strcpy(str1,"Umrah");
    while(1)
    {
        gets(str2);
        y=strlen(str2);
        if(str2[j]=='*')
            break;
        for(i=0;i<=y;i++)
        {
            if(str2[i]==str[i])
            { if(str2[i]!=str[i])
               break;
                if(str2[i]!='\0')
                    continue;
                printf("Case %d: Hajj-e-Akbar\n",count);
            }

            else if(str1[i]==str2[i])
            {   if(str1[i]!=str2[i])
                 break;
                if(str2[i]!='\0')
                    continue;
                printf("Case %d: Hajj-e-Asghar\n",count);
            }
        count++;
        }
    }
return 0;
}










