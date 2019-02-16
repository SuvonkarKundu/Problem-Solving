#include<stdio.h>
#include<conio.h>
main()
{
int i,j,k,l=1,n;

 scanf("%d",&n);

  for(i=1;i<=n;i++,l++)
     {
     for(j=1;j<=n;j++)
     {
     for(k=1;k<=n;k++)
     {
       if(l%2==0)
         {
         printf("*");
         }
        else
        {
         printf(" ");
         }
           printf("\n");

     }

     }


     }



}
