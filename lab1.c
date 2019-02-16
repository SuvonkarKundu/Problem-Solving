#include<stdio.h>
main()
{
    int a[100],q,i,r,e=0,j;
    scanf("%d",&q);
    for(i=0;i<q;i++)
    {
        scanf("%d",&a[i]);
    }
     scanf("%d",&r);
     for(j=0;j<q;j++)
     {
         if(a[j]==r)
         {
         printf("r is found");
         e=1;
         }

     }

if(e==0)
printf("r is not found");
return 0;
}













