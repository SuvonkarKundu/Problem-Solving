#include<stdio.h>
 main()
{
long long int I,r,t,a[100],i;
while(1)
{
r=0;
i=0;
scanf("%lld",&I);
if(I==0)
break;
while(I!=0)
{
a[r]=I%2;
if(a[r]==1)
i++;
I=I/2;
r++;
}
printf("The parity of ");
for(t=r-1;t>=0;t--)
printf("%lld",a[t]);
printf(" is %lld (mod 2).\n",i);
}
return 0;
}













