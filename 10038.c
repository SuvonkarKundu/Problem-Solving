#include<stdio.h>
#include<math.h>
main()
{
    long int a[3000],array[3000],t,h,v,e,q,n,w,i,j,c;
    while(scanf("%ld",&n)!=EOF)
    {
        t=0;
        v=1;
        for(i=0;i<n;i++)
        {
            scanf("%ld",&a[i]);
        }
        for(j=0;j<=n-1;j++)
        {
            h=a[j]-a[j+1];
            e=abs(h);
            array[t]=e;
            t++;
        }
        for(q=0;q<=t-1;q++)
        {
            if(array[q]>n-1)
            {   v=array[q];
               printf("Not jolly\n");
                break;
            }
            else
            {
                if(array[q]<=n)
                {
                    w=array[q];
                }
            c=array[q]-array[q+1];
            abs(c);
            if(c==0)
            {  w=c;
               printf("Not jolly\n");
               break;
            }

            else if(c<n-1)
            {
               w=c;
            }
            }

        }
        if(w<=n-1&&v<n-1&&w!=0)
        {
          printf("Jolly\n");
        }
    }
return 0;
}

















