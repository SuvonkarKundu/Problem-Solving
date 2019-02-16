#include<stdio.h>
main()
{
    long int n,p,q,t,h,sum,count,weight[100],i,j,k;
     scanf("%ld",&t);
     for( i=1;i<=t;i++)
     {
            sum=0;
           count=1;
          scanf("%ld%ld%ld",&n,&p,&q);
            for( k=1;k<=n;k++)
            {
              scanf("%d",&weight[k]);
            }
            for( j=1;j<=n;j++)
            {
               sum+=weight[j];
               h=q*sum;
            if(h<=q)
            {
              count++;
            }
            else
            {
             break;
            }
            }
       printf("Case %d: %d\n",i,count);
      }
   return 0;
   }






