
#include<stdio.h>
 main()
{
 int a,b,t,h,i,q,z,sum;
scanf("%ld",&t);
for(h=1;h<=t;h++)
{
scanf("%d %d",&a,&b);
sum=0;
 if(a>b)
        {
         q=a;
         z=b;
        }
        else
        {
            q=b;
            z=a;
        }
for(i=z;i<=q;i++)
{
if(i%2!=0)
sum+=i;
}
printf("Case %d: %d\n",h,sum);
}
 return 0;
}











