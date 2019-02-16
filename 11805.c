
#include<stdio.h>
main()
{
    int n,k,v,tc,i,count,j,t,q;
    scanf("%d",&tc);
    for(i=1;i<=tc;i++)
    {
        count=-1;
       scanf("%d %d %d",&n,&k,&v);
       t=(k+v);

       for(j=n;j<=t;j++)
       {
           count++;

          if(n==t)
           {
               printf("Case %d: %d\n",i,n);
           }
       }
       q=count;
if(q==count)
{
    printf("Case %d: %d\n",i,count);
}


    }
}




















