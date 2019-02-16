#include<stdio.h>
main()
{
   long int q,c,t,j,i,array[100000],count;
   while(scanf("%ld %ld",&q,&c)!=EOF)
   {
       count=0;
       while(1)
       {
           array[count]=q/c;
           t=q%c;
           if(t==0)
           {
               break;
           }
           q=c;
           c=t;
           count++;
       }
       printf("[");
       for(i=0;i<=count;i++)
       {
           printf("%ld",array[i]);
           if(i==0)
           {
               printf(";");
           }
           if(i!=0&&i<count)
           {
               printf(",");
           }

       }
       printf("]");
       printf("\n");
   }
return 0;
}














