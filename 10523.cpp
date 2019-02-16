#include<stdio.h>
#include<math.h>
main()
{
  long  long double N,A,i,sum,j=0,q;
  while(scanf("%lLf %lLf",&N,&A)==2)
        {

        sum=0;
        for(i=1;i<=N;i++)
            {

                sum+=(i*pow(A,i));
            }
        printf("%lld\n",sum);

    }

return 0;
}















