#include<stdio.h>
main()
{
    int array[1000],n,i,h,sum,t,j,v,c,count=0,q;
    while(scanf("%d",&n)==1)
    {
        h=0;
        sum=0;
        q=0;
        count++;
        if(n==0)
        {
            break;
        }
        for( i=0;i<n;i++)
        {
            scanf("%d",&array[i]);
            h+=array[i];
        }
         t=h/n;
         for(j=0;j<n;j++)
         {

             if(t>array[j])
             {
               v=t-array[j];
               sum+=v;
             }
             if(t<array[j])
             {
                 c=array[j]-t;
                 q+=c;
             }
         }
        if(sum>q)
        {
              printf("Set #%d\n",count);
              printf("The minimum number of moves is %d.\n",sum);
        }
        else
        {
              printf("Set #%d\n",count);
        printf("The minimum number of moves is %d.\n\n",q);
        }
             }
    return 0;
}
