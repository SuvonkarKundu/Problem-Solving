#include<stdio.h>
main()
{
    int array[1000],i,j,t,c,n;
    double result,w,h,count,sum;
    scanf("%d",&c);
    for(i=0;i<c;i++)
    {
        sum=0;
        count=0;
        scanf("%d",&n);
        for(j=0;j<n;j++)
        {
            scanf("%d",&array[j]);
            sum+=array[j];
        }
        h=sum/(double)n;
        for(t=0;t<n;t++)
        {
            if(array[t]>h)
            {
                count++;
            }
        }
        w=count/(double)n;
        result=w*100;
        printf("%0.3lf%%\n",result);
    }
  return 0;
}














