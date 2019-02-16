#include<stdio.h>
#include<string.h>
void main()
{
    char a[100],b[100],c[100];
    int i=0,j,y,p,k,q,l,onhand=0,res,t,z;
    gets(a);
    scanf("%d",&l);
    y=strlen(a);
    for(j=(y-1);j>=0;j--)
    {
       b[i]=a[j];
       i++;
    }
    for(p=0;p<=(y-1);p++)
    {
        k=b[p]-48;
        q=k*l+onhand;
        res=q%10;
        onhand=q/10;
        c[p]=res+48;
    }
   while(onhand>0)
   {
       t=onhand%10;
       c[p]=t+48;
       p++;
       onhand=onhand/10;
   }

     for(z=(p-1);z>=0;z--)
     {
         printf("%c",c[z]);
     }

}

















