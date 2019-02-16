
#include<stdio.h>
 main()
{
     long long int n,i,h;
    while(1)
    {
        scanf("%lld",&n);
        if(n<0)
        break;

            h=(n*(n+1)/2)+1;

        printf("%lld\n",h);
    }
    return 0;
}


















