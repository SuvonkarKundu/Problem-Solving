#include<stdio.h>
main()
{
long long int n,array[50000],first,second,t,q,w,sum;
    while(scanf("%lld",&n)!=EOF)
    {
        first=0;
        second=1;
        t=0;
        for(q=0;q<n;q++)
        {
            if(q<=1)
            {
                array[t]=q;
            }
            else
            {
                array[t]=first+second;
                first=second;
                second=array[t];
            }
            t++;
        }

        for(w=n;w<=n;w++)
        {
            sum=array[n-1]+array[n-2];
        }
        printf("The Fibonacci number for %lld is %lld\n",n,sum);
    }

return 0;
}













