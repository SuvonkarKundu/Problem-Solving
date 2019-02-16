#include<stdio.h>
  int GCD(int a, int b)
    {
      int gcd,r=1;
       while(r!=0)
        {
            r=a%b;
            a=b;
            b=r;
            gcd=a;
        }
        return(gcd);
    }

 main()
{
   long int g;
   int i,j,n;
    while(1)
    {
        scanf("%d",&n);

        g=0;
        if(n==0)
            break;

        for(i=1;i<n;i++)
        {
            for(j=i+1;j<=n;j++)
            {

                g+=GCD(i,j);

            }
        }
printf("%ld\n",g);
    }

   return 0;
}























