#include<stdio.h>
main()
{
    long int l,h,i,count=0,j,t,n,q,c;
    while(1)
    {
        int max=0;
        scanf("%ld %ld",&l,&h);
        if(l==0&&h==0)
        {
            break;
        }
        if(l>h)
        {
            q=l;
            c=h;
        }
        else
        {
            q=h;
            c=l;
        }
        for(i=c;i<=q;i++)
         {
             n=i;
             count=0;
             while(1)
             {
                 if(n%2!=0)
                 {
                     n=(3*n)+1;
                     count++;
                 }
                 else if(n%2==0)
                 {
                     n=n/2;
                     count++;
                 }
                 if(n==1)
                 {
                     break;
                 }
             }
             if(count>max)
             {
                 max=count;
                 t=i;
                 }
         }
    printf("Between %ld and %ld, %ld generates the longest sequence of %ld values.\n",c,q,t,max);
    }
 return 0;
}
