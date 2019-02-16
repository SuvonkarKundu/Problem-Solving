#include<stdio.h>
#include<math.h>
main()
{
  long  long int N,A,i,sum,j=0,q;
  while(1)
        {
        scanf("%lld %lld",&N,&A);
        if(A==0&&N==0)
            break;
        sum=0;
        for(i=1;i<=N;i++)
            {

                sum+=(i*pow(A,i));
            }
        printf("%lld\n",sum);

    }

return 0;
}















