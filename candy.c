#include<stdio.h>
main()
{
    int array[10000],n,i,h,sum,t,j,v,c,q;
    while(scanf("%d",&n)==1)
    {
        h=0;
        sum=0;
        q=0;
        if(n==-1)
        {
            break;
        }
        for( i=0;i<n;i++)
        {
            scanf("%d",&array[i]);
            h+=array[i];
        }
        if(h%n!=0)
        {
            printf("-1\n");
        }
         else
         {
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
        if(sum<q)
        {
            printf("%d\n",sum);
        }
        else if(q<sum)
        {
            printf("%d\n",&q);
        }
        else if(q==sum)
        {
           printf("%d\n",sum);
        }

         }

}
return 0;
}
