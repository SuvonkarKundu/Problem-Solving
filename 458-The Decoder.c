#include<stdio.h>
#include<string.h>
main()
{
    char str[100],gather[100];
    int t,c,w,i;

    while(gets(str))
    {
        t=strlen(str);
        for(i=0;i<t;i++)
        {
            gather[i]=str[i]-(55-0);
            puts(gather);


        }



    }





}













