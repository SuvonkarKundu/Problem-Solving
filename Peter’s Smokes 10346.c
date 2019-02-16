#include<stdio.h>
 main()
{
   int n,k,q,count,v;
    while(scanf("%d %d",&n,&k)!=EOF)
    {
      count=0;
      v=n;
      while(1)
      {
          q=n/k+1;
          n=q;
          if(n<=1)
            break;
          v++;
      }
      printf("%d\n",v);
    }
return 0;
}












