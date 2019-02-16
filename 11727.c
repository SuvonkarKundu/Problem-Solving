#include<stdio.h>
 main()
{
long long int a,b,c;
int tc,i;
scanf("%d",&tc);
for(i=1;i<=tc;i++)
{
scanf("%lld %lld %lld",&a,&b,&c);
if(b>a&&b<c)
printf("Case %d: %lld\n",i,b);
else if(a>c&&a<b)
printf("Case %d: %lld\n",i,a);
else if(a>b&&a<c)
printf("Case %d: %lld\n",i,a);
else if(b>c&&b<a)
printf("Case %d: %lld\n",i,b);
else
printf("Case %d: %lld\n",i,c);
}
return 0;
}











