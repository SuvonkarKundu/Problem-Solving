#include<stdio.h>
main()
{
    float n,a=0,i,h;
    scanf("%f",&n);
    for(i=1;i<=n;i++)
    {

        a+=1/i;

    }
   printf("%0.1f",a);
}
