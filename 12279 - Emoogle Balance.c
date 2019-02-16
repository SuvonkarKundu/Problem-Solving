#include<stdio.h>
main()
{
    int array[10000],n,i,j,count,t,result,testcase=0;
    while(1)
    {   count=0;
        t=0;
        scanf("%d",&n);
        if(n==0)
        {
            break;
        }
        for(i=0;i<n;i++)
        {
            scanf("%d",&array[i]);
        }

        for(j=0;j<n;j++)
        {
            if(array[j]==0)
            {
                count++;
            }
            if(array[j]>0)
            {
                t++;
            }

        }
         result=t-count;
          testcase++;
        printf("Case %d: %d\n",testcase,result);


    }
return 0;
}
















