#include<stdio.h>
main()
{
    int array[1000],n,tc,i,j,t,c,q,count,h;
    scanf("%d",&tc);
    for(i=1;i<=tc;i++)
    {

        scanf("%d",&n);
        h=n/2;
        for(j=0;j<n;j++)
        {
            scanf("%d",&array[j]);
        }
        for(c=0;c<n;c++)
        {
            count=0;
            t=array[c];
            for(q=0;q<n;q++)
            {
                if(t>array[q])
                {
                 count++;
                }
            }
            if(count==h)
            {
                break;
            }
        }

        printf("Case %d: %d\n",i,t);

    }
return 0;
}


















