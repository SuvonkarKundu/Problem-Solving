#include<stdio.h>
#include<math.h>
main()
{
    double a,b,c,d,s,h;
   long int i,t;
    scanf("%ld",&t);
    for(i=1;i<=t;i++)
    {
        scanf("%lf %lf %lf %lf",&a,&b,&c,&d);

        s=(a+b+c+d)/2;
        h=sqrt((s-a)*(s-b)*(s-c)*(s-d));
        printf("%0.2lf\n",h);
    }
return 0;
}















