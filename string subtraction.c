#include<stdio.h>
#include<string.h>
main()
{
   int i,j,onhand,k;
   char a[100],b[100],c[100];
   scanf("%s%s",&a,&b);
   strrev(a);
   strrev(b);
   int l1=strlen(a),l2=strlen(b);
   onhand=0;
   for(i=0;i<l1||i<l2;i++)
   {
      if(a[i]<b[i])
      {
         a[i]=a[i]+10;
         b[i]=b[i]+onhand;
         c[i]=(a[i]-48)-(b[i]-48)+48;
         onhand++;
      }
      else
      {
          b[i]=b[i]+onhand;
        c[i]=(a[i]-48)-(b[i]-48)+48;
      }
   }
   c[i]=NULL;
   for(j=i;j>=0;j--)
   printf("%c",c[j]);
   return 0;
}
