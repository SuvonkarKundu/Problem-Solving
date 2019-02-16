#include<stdio.h>
#include<string.h>
main()
{
    char rever[5000];
    int t,q,h,temp,c,i,v;
    while(1)
    {    scanf("%d",&t);
        getchar();
         if(t==0)
         {
             break;
         }
         gets(rever);
         q=strlen(rever);
         t=q/t;
         h=t;
         v=t;
         for(i=0;i<q;i++)
         {
             if(i==t-1)
             {

                 for(temp=i;temp>=(t-h);temp--)
                 {
                     printf("%c",rever[temp]);
                 }
                 t=v+t;
             }
         }
       printf("\n");

    }
}










