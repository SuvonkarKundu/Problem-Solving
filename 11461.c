#include<stdio.h>
#include<math.h>
void main()
{
long int a,b,k,h,i;
float l;
while(1)
{
h=0;
scanf("%ld %ld",&a,&b);
if(a==0&&b==0)
break;
else
{
for(i=a;i<=b;i++)
{
k=sqrt(i);
l=(int)k*k;
if(l==i)
h++;
}
printf("%ld\n",h);
}
}
}











