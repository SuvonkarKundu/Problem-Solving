#include<stdio.h>
main()
{
    int tc,n,i,j,t;
    double a0,a1,c1,result;
    scanf("%d\n\n",&tc);
    for(i=1;i<=tc;i++)
    {    t=1;
        scanf("%d",n);
        while(t<=1)
        {   scanf("%lf %lf %lf",&a0,&a1,&c1);
            result=(a0+a1)/2-c1;
            t++;
        }
        printf("%0.2lf\n\n",result);

    }
return 0;
}
















