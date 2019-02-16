#include<stdio.h>
main()
{
    long long int i,j,h,l,a,q,tc,count=0;
    int N;
    scanf("%lld",&N);
    for(tc=1; tc<=N; tc++)
    {
        scanf("%lld%lld",&h,&l);

        if(h>l)
        {
            a=h;
            q=l;
        }
        else
        {
            a=l;
            q=h;
        }
        for(i=q; i<=a; i++)
        {
            for(j=2; j<=i; j++)
            {
                h=(i%j);
                if(h!=0)
                    continue;
                if(i==j)
                    count++;
                else
                    break;
            }
        }
        printf("%lld\n",count);
    }
}








