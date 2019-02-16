#include<stdio.h>
 main()
{
long int a,b,c;
int tc,i;
scanf("%d",&tc);
for(i=1;i<=tc;i++)
{
scanf("%ld %ld %ld",&a,&b,&c);
if(a+b<=c||a+c<=b||b+c<=a)
printf("Case %d: Invalid\n",i);
else if(a==b&&a==c&&b==c)
printf("Case %d: Equilateral\n",i);
else if(a==b&&a!=c||b==c&&a!=b||c==a&&b!=c)
printf("Case %d: Isosceles\n",i);
else if(a!=b&&a+b>c&&b!=c&&b+c>a&&a!=c&&a+c>b)
printf("Case %d: Scalene\n",i);
}
return 0;
}















