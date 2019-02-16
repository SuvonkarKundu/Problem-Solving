#include<stdio.h>
 main()
{
  int array[100];
    long int t,i,n,q,w,e,r,y,u,j,v;
    scanf("%ld",&t);
    for(i=1;i<=t;i++)
    {   int j=0;
        scanf("%ld",&n);
        q=n*567;
        w=q/9;
        e=w+7492;
        r=e*235;
        y=r/47;
        u=y-498;
        while(u!=0)
        {
            array[j]=u%10;
            u=u/10;
            if(j==1)
            printf("%d\n",array[j]);
            j++;
            if(j==2)
            break;
        }

    }
return 0;
}

















