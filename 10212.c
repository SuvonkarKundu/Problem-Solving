#include<stdio.h>
long int factorial(long int n)
{
if(n<=1)
return 1;
else
return(n*factorial(n-1));
}

main()
{
    long long int n,m,v,i,e,w,array[100],j;
    while(scanf("%lld %lld",&n,&m)!=EOF)
    {   j=0;
        v=(n-m);
        i=factorial(n);
         e=factorial(v);
         w=i/e;
         while(w!=0)
         {
           array[j]=w%10;
           w=w/10;
           if(array[j]!=0)
            {
                printf("%lld\n",array[j]);
                break;
            }
              j++;

         }
    }
}


















