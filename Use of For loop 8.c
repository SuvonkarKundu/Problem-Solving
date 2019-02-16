#include<Stdio.h>
main()
{
    float v,n,m;
    for(n=1,m=50;n<=m;n=n+1,m=m-1)
    {
        v=m/n;
        printf("%f %f %f",n,m,v);
    }


    return 0;


}







