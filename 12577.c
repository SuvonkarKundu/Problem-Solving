#include<stdio.h>
#include<string.h>
main()
{
    char str[100],str1[100],str2[100];
    int j=0,count=1;
    strcpy(str,"Hajj");
    strcpy(str1,"Umrah");
    while(1)
    {
        gets(str2);
        if(str2[j]=='*')
            break;
            if(strcmp(str,str2)==0)
            {
                printf("Case %d: Hajj-e-Akbar\n",count);
            }

            else if(strcmp(str1,str2)==0)
            {
                  printf("Case %d: Hajj-e-Asghar\n",count);

            }
              count++;
    }
  return 0;
}







