
#include<stdio.h>
main()
{
    long long int i,j,a,q,h;

    scanf("%lld %lld",&a,&q);

    for(i=a; i<=q; i++)
    {
        if(i==1)
        {
            printf("%lld\n",i);
        }
        for(j=2; j<=i; j++)
        {

            h=(i%j);
            if(h!=0)
                continue;
            else
            {
                break;
            }
        }
        if(i==j)
        {
            printf("%lld\n",i);
        }
    }
}









