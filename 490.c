#include<stdio.h>
void main()
{
    char a[100],b[100];
    int i,n=0,y,l,k,z;
    while(1)
    {
        gets(a);
        gets(b);
        n++;
        if(n==100)
        break;
       y=strlen(a);
       l=strlen(b);

       if(y>l)
       {
        k=y;
        //z=y-l;
       }

       else
       {
          k=l;
          //z=l-y;
       }


       for(i=0;i<k;i++)
       {

         if(a[i]=='\0'||b[i]=='\0')
         {
            if(l>y)
         printf("%c%c\n",b[i]);
            else
            printf("%c%c\n",a[i]);
         }
        else
         printf("%c%c\n",b[i],a[i]);
       }
    }
}















